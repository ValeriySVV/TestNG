package apiTesting;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JasonObjectTest {

    private final String johnDou = "{\n" +
            " \"name\": \"John Doe\",\n" +
            " \"age\": 30,\n" +
            " \"address\": {\n" +
            "\"street\": \"Main Street\",\n" +
            "\"city\": \"London\",\n" +
            "\"country\": \"United Kingdom\"\n" +
            " },\n" +
            " \"hobbies\": [\"reading\", \"writing\", \"coding\"]\n" +
            "}\n";

    @Test
    public void parseJson(){
        var json = new JSONObject(johnDou);
        System.out.println(json);
        System.out.println(json.get("age"));
        Assert.assertEquals(json.getJSONObject("address").get("street"), "Main Street");
    }
    @Test
    public void createJson(){
        var json = new JSONObject();
        json.put("age", 40);
        System.out.println(json);
    }
}
