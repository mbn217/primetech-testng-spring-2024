package api_tests;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.annotations.Test;




public class JSONSchemaValidatorExample {

    @Test
    public void schemaValidatoExampleForPetStoreGetRequest(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        Response response = RestAssured.given()
                .when()
                .get("/pet/88888");
        response.prettyPrint();
        response
                .then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("json-schema-example.json"));



    }

}
