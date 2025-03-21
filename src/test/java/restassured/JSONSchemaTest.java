package restassured;

import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JSONSchemaTest extends BaseClass{
    @Test
    public void testJSONSchemaValidation(){
        request.when().get("/user/2").
                then().assertThat().
                body(matchesJsonSchemaInClasspath("src/test/resources/user_schema.json"));
    }
}
