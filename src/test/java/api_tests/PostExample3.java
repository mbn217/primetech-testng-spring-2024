package api_tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PostExample3 {


    @Test
    public void postExampleOption1(){
        //Option 1 using the body as a JSON String
        RestAssured.baseURI = "https://reqres.in";
        String requestBody = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";

        Response response = RestAssured.given()
                .header("ContentType","application/json")//optional
                .body(requestBody)
                .when()
                .post("/api/users");//create a new user

        response.then().statusCode(201);
        response.prettyPrint();

        Assert.assertEquals(response.getStatusCode(), 201);

    }



    @Test
    public void postExampleOption2(){
        //Option 1 using the body as a JSON String
        RestAssured.baseURI = "https://reqres.in";
        /**
         * Serialization --> The process of converting a data object (like json, java object) into a format
         * that could be easily transmitted
         * Deserialization --> The reverse process of serialization, it involves converting data like json or
         * xml back into java object
         * We need below code to help us serialize the Java Object into json
         * Meaning converting the java object into json
         */
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "morpheus");
        requestBody.put("job", "leader");

        Response response = RestAssured.given()
                .header("Content-Type","application/json")//optional
                .body(requestBody)
                .when()
                .post("/api/users");//create a new user

        response.then().statusCode(201);
        response.prettyPrint();

        Assert.assertEquals(response.getStatusCode(), 201);

    }

}
