package api_tests;


import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


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
        given()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data[1].id", equalTo(8))
                .body("support.url", equalTo("https://reqres.in/#support-heading"))
                .body("data.first_name" , hasItems("Michael","Lindsay","Byron"));


    }

    @Test
    public void testCaseThree(){
        Response response = get("https://reqres.in/api/users?page=2");
        int totalPages = response.path("total_pages");
        System.out.println(totalPages);
        String supportURL = response.path("support.url");
        System.out.println(supportURL);

        String firstElementEmail = response.path("data[0].email");
        System.out.println(firstElementEmail);
        System.out.println("------------------");

        //We use jsonPath() method to call getList() that will return a list of element
         List<String> listOfEmails = response.jsonPath().getList("data.email");

        System.out.println(listOfEmails);

        Assert.assertEquals(firstElementEmail , "michael.lawson@reqres.in");


    }







}
