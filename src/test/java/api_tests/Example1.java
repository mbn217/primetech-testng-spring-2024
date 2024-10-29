package api_tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Example1 {


    @Test
    public void demoOne(){
       Response response =  RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());

        System.out.println("=======================================");
        System.out.println(response.getHeader("content-type"));
        System.out.println("=======================================");
        System.out.println(response.getBody().prettyPrint());


    }


}
