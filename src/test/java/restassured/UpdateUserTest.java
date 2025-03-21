package restassured;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class UpdateUserTest extends BaseClass{


    @Test
    public void testUpdateUser() throws JSONException {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","shubhamV3");
        requestBody.put("job","Senior senior QA Engineer");

        request.
                body(requestBody.toString()).
                header("Content - Type","application/json").
                when().put("users/2").
                then().statusCode(200).log().all();
    }
}
