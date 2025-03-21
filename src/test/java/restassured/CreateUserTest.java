package restassured;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class CreateUserTest extends BaseClass{
    @Test
    public void testCreateUser() throws JSONException {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","ShubhamV2");
        requestBody.put("job","Senior QA Engineer");

        request.body(requestBody.toString()).
                header("Content - Type","application/json").
                when().post("/users").
                then().statusCode(201);
    }
}
