package api_tests;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Example2 {



    @Test
    public void testCaseOne(){
        baseURI = "https://reqres.in";

        given()
                .get("/api/users?page=2")
                .then()
                .statusCode(200);

    }

    @Test
    public void testCaseTwo(){
        baseURI = "https://reqres.in";


    }







}
