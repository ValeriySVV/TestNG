package apiTesting;

import apiTesting.dto.Activity;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiCoverPhotosTest {

    final String apiUrl = "https://fakerestapi.azurewebsites.net/api/v1";

    OkHttpClient client = new OkHttpClient.Builder().build();

    public static final MediaType JSON = MediaType.get("application/json");

/*    private void printMethodName() {
        System.out.println(Thread.currentThread().getStackTrace()[2]
                + " @ "
                + Thread.currentThread().getName());
    }*/

    @Test
    public void getCoverPhotos() {
        final String endpointName = "/CoverPhotos";
        String url = apiUrl + endpointName;

        Request request = new Request.Builder()
                .url(url)
                .header("accept", "text/plain; v=1.0")
                .build();
        try (Response response = client.newCall(request).execute()) {
            int code = response.code();
            Assert.assertEquals(code, 200, "Response code must be 200, but got " + code + " instead.");
            var mapper = new ObjectMapper();
            var CoverPhotos = mapper.readValue(response.body().string(), Activity[].class);
            //System.out.println(activities);
            Assert.assertNotNull(CoverPhotos);
            Assert.assertEquals(CoverPhotos.length, 200);
            Assert.assertEquals(CoverPhotos[199].getId(), 200);
            Assert.assertEquals(CoverPhotos[199].getIdBook(), 200);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void putCoverPhotos() {
        final String endpointName = "/CoverPhotos/4";
        String url = apiUrl + endpointName;
        var jsonBody = "{\"id\": \"4\",\"idBook\": \"203\",\"url\": \"https://placeholdit.imgix.net/~text?txtsize=33&txt=Book 1&w=250&h=350\"}";

        RequestBody body = RequestBody.create(jsonBody, JSON);
        Request request = new Request.Builder()
                .url(url)
                .method("PUT", body)
                .header("accept", "text/plain; v=1.0")
                .header("Content-Type", "application/json; v=1.0")
                .build();
        try (Response response = client.newCall(request).execute()) {
            int code = response.code();
            Assert.assertEquals(code, 200, "Response code must be 200, but got " + code + " instead.");
            var mapper = new ObjectMapper();
            var CoverPhotos = mapper.readValue(response.body().string(), Activity.class);
            //System.out.println(CoverPhotos);
            Assert.assertEquals(CoverPhotos.getIdBook(), 203);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void deleteCoverPhotos() {
        final String endpointName = "/CoverPhotos/5";
        String url = apiUrl + endpointName;
        Request request = new Request.Builder()
                .url(url)
                .method("DELETE", RequestBody.create("", JSON))
                .header("accept", "*/*")
                .build();
        try (Response response = client.newCall(request).execute()) {
            int code = response.code();
            Assert.assertEquals(code, 200, "Response code must be 200, but got " + code + " instead.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
