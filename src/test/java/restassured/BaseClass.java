package restassured;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {

    RequestSpecification request;
    @BeforeClass
    public void setUp(){
        RestAssured.baseURI="https://reqres.in/api";
        request=RestAssured.given().log().all();
    }
}
