package restassured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class TokenTesting {
    RequestSpecification request;

    @BeforeTest
    public void setUp() {
        RestAssured.baseURI = "https://reqres.in/";
        request = RestAssured.given().log().all();
    }

    @Test
    public void tokenTest() {
        Response response = request.
                when().
                get("/api/users/2").
                then().
                statusCode(200).
                log().all().
                extract().response();

        String token = response.jsonPath().getString("token");
        System.out.println(token);

    }

    @Test
    public void getToken() {
        String body = "{\n" +
                "    \"name\": \"Shubham2\",\n" +
                "    \"job\": \"Engi2\"\n" +
                "}";
        Response authResponse = request.body(body).when().
                post("/api/users").
                then().
                statusCode(201).
                log().all().
                extract().response();

        String token = authResponse.jsonPath().getString("token");
        System.out.println(token);

    }
}
