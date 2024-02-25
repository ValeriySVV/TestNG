package wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import java.io.IOException;
import java.time.Duration;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class wiremockTest {

    int port = 9098;
    OkHttpClient client = new OkHttpClient.Builder().build();



    WireMockServer wireMockServer
            = new WireMockServer(new WireMockConfiguration().port(port));
    @BeforeClass
    public void beforeClass(){
        wireMockServer.start();
        WireMock.configureFor(port);
        WireMock.stubFor(
                WireMock.get(
                        WireMock.urlEqualTo("/homework-request")
                ).willReturn(
                        WireMock.aResponse().withStatus(222)
                                .withFixedDelay(571)

                )
        );
    }

    @AfterClass
    public void afterClass(){
        wireMockServer.stop();
    }

    @Test
    public void statusAnswerCode() throws IOException, InterruptedException {
        var request = new Request.Builder()
                .url("http://localhost:" + port + "/homework-request")
                .header("accept-language", "de")
                .build();
        try (var response = client.newCall(request).execute()){
            var code = response.code();

            Assert.assertEquals(code, 222, "Response code must be 222 but got " + code);

        }

    }

}
