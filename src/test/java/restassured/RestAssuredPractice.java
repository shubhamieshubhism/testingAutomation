package restassured;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RestAssuredPractice {
    @Test
    public void getUser(){
        RestAssured.baseURI="https://reqres.in/api";
        RestAssured.given().
                when().get("/users/2").
                then().statusCode(200).
                log().all().
                extract().response();
    }

    @Test
    public void postUser() throws JSONException {
        RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
        String body = "\t{\"name\":\"shubham1\",\"salary\":\"120\",\"age\":\"139\"}";
        RestAssured.given().
                log().all().
                header("Content-Type", "application/json").
                body(body).
                when().post("/create").
                then().assertThat().statusCode(200).
                extract().response();
    }

}
