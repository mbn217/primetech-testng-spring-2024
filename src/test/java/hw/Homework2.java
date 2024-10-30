package hw;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Homework2 {

    /**
     * Testcase 1:
     *  Perform a POST request to upload a PET
     * Verify the status code is 200
     * Verify the content type is application.json
     * Verify the pet name and status match your request body input
     */
    @Test
    public void test1() {
        Response response = post("https://petstore.swagger.io/v2/pet");
        response.then().statusCode(200);
        response.then().contentType("application/json");
        response.then().body("name", equalTo("booboo"));
    }


    /**
     * Testcase 2:
     * Perform a PUT request to update a pet with existing ID
     * Verify the status code is 200 and content type is application.json
     * Verify the response body matches your request body
     */
    @Test
    public void test2() {
        Response response = put("https://petstore.swagger.io/v2/pet/201029");
        response.then().statusCode(404);
        response.then().contentType("application/json");
        response.then().body("message", equalTo("Pet not found"));
    }

}
