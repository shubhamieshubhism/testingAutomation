package restassured;

import org.testng.annotations.Test;

public class DeleteUserTest extends BaseClass{
    @Test
    public void testDeleteUser(){
        request.when().delete("user/2").
                then().statusCode(204);
    }
}
