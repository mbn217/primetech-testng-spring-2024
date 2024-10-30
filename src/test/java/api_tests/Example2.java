package api_tests;


import org.testng.annotations.Test;


import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
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
                .body("data[1].id", equalTo(8) )
                .body("support.url", equalTo("https://reqres.in/#support-heading"))
                .body("data.first_name" , hasItems("Michael","Lindsay","Byron"));


    }







}
