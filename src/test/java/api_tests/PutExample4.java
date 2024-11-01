package api_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PutExample4 {


    @Test
    public void putExample(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        JSONObject requestBody = new JSONObject();
        requestBody.put("id" , 88888);
        requestBody.put("name", "luckyAnimal - Option 2");

        Response response = RestAssured.given()
                .contentType("application/json")//this is optional
                .body(requestBody.toJSONString())
                .when()
                .put("/pet");

        response.prettyPrint();
    }

}
