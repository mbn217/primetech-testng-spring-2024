package hw;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class HomeWork1 {

    /**
     * Testcase 1:
     * Perform a GET request to find a pet with id 22112
     * Verify the status code is 200
     * Verify the content type is application/json
     * Verify the pet name is booboo status is available
     */

    @Test
    public void test1(){
//        Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/22112");
//        response.then().statusCode(200);
//        response.then().contentType("application/json");
//        response.then().body("name", Matchers.equalTo("booboo"));

        //option 2
        RestAssured.given()
                .contentType("application/json")//this is optional
                .when()//this is optional
                .get("https://petstore.swagger.io/v2/pet/22112")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .body("name", Matchers.equalTo("booboo"));


    }

    /**
     * Testcase 2:
     * Perform a GET request to find a pet with 201029
     * Verify the status code is 404 and content type is application.json
     * Verify message is Pet not found
     */
    @Test
    public void test2(){
        Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/201029");
        response.then().statusCode(404);
        response.then().contentType("application/json");
        response.then().body("message", Matchers.equalTo("Pet not found"));
    }

}
