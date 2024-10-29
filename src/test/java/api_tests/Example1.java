package api_tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utilities.ExcelUtility;


import static io.restassured.RestAssured.get;
import static utilities.ExcelUtility.getDataSet;

public class Example1 {


    @Test
    public void demoOne(){
       Response response =  get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());

        System.out.println("=======================================");
        System.out.println(response.getHeader("content-type"));
        System.out.println("=======================================");
        System.out.println(response.getBody().prettyPrint());


    }

    @Test
    public void demoTwo(){
       Response response = get("https://www.google.com");
       System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void demoThree(){
        Response response = get("https://www.google.com");
        System.out.println(response.getBody().prettyPrint());

    }


}
