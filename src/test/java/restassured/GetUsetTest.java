package restassured;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUsetTest extends BaseClass {
    @Test
    public void getUserTest(){
        Response response = request.
                when().get("/users/2")
                .then().statusCode(200).log().all().extract().response();

        String email = response.jsonPath().getString("data.email");
        Assert.assertTrue(email.contains("@"),"Email is invalid");



    }
}
