package hw;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class HomeWork2 {
    /**
     * URL :https://petstore.swagger.io/#/
     * Testcase 1:
     * Perform a POST request to upload a PET
     * Verify the status code is 200
     * Verify the content type is application.json
     * Verify the pet name and status match your request body input
     */
    @Test
    public void createNewPet(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        JSONObject requestBody = new JSONObject();
        requestBody.put("id" , 88888);
        requestBody.put("name", "luckyAnimal");

        Response response = RestAssured.given()
                .contentType("application/json")//this is optional
                .body(requestBody.toJSONString())
                .when()
                .post("/pet");

        response.then().statusCode(200);
        response.then().contentType(ContentType.JSON);
        response.then().body("name", Matchers.equalTo("luckyAnimal"));






    }





}
