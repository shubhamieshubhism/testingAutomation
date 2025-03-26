package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostPractice {
    @Test
    public void practicePost(){
        String Body = "xyz";

        Response response = RestAssured.given().body(Body.toString()).header("Content - type","application/json")
                .when().post("xyasdfds").then().statusCode(201).extract().response();
    }
}
