package hw;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

public class Homework1 {

    /**
     * Testcase 1:
     * Perform a GET request to find a pet with id 22112
     * Verify the status code is 200
     * Verify the content type is application.json
     * Verify the pet name is booboo status is available
     */
    @Test
    public void test1() {
        Response response = get("https://petstore.swagger.io/v2/pet/22112");
        response.then().statusCode(200);
        response.then().contentType("application/json");
        response.then().body("name", equalTo("booboo"));
    }


    /**
     * Testcase 2:
     * Perform a GET request to find a pet with 201029
     * Verify the status code is 404 and content type is application.json
     * Verify message is Pet not found
     */

    @Test
    public void test2() {
        Response response = get("https://petstore.swagger.io/v2/pet/201029");
        response.then().statusCode(404);
        response.then().contentType("application/json");
        response.then().body("message", equalTo("Pet not found"));
    }
}
