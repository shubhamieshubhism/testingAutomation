package SeleniumLogics;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestAssuredIn {
    public static void main(String[] args) {
        Response response = given()
                .when()
                .get("https://petstore.swagger.io/v2/store/inventory")
                .then().extract().response();

        System.out.println(response.getBody().asPrettyString());


        String requestBody = "{\n" +
                "  \"id\": 2,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        Response presponse = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then().statusCode(200)
                .extract().response();

        System.out.println(presponse.getBody().asPrettyString());
    }
}
