package hw;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Homework2 {

    /**
     * Testcase 1:
     *  Perform a POST request to upload a PET
     * Verify the status code is 200
     * Verify the content type is application.json
     * Verify the pet name and status match your request body input
     */
    @Test
    public void test1() {
        // JSON string payload to represent a new pet
        String petJson = "{ " +
                "\"id\": 12345, " +
                "\"name\": \"Buddy\", " +
                "\"status\": \"available\" " +
                "}";

        // Send POST request with JSON string directly
        given()
                .contentType("application/json")  // Specify JSON content type
                .body(petJson)                     // Use the JSON string as the request body
                .when()
                .post("/pet")                      // Endpoint to add a new pet
                .then()
                .statusCode(200)                   // Expect 200 OK status
                .body("id", equalTo(12345))        // Check if the response contains the correct ID
                .body("name", equalTo("Buddy"))    // Validate the name of the pet
                .body("status", equalTo("available"));  // Validate the status

        //--------Option two -----
        /**
         * import io.restassured.RestAssured;
         * import io.restassured.response.Response;
         *
         * public class PetStoreTest {
         *
         *     public static void main(String[] args) {
         *         // Set the base URI
         *         RestAssured.baseURI = "https://petstore.swagger.io/v2";
         *
         *         // JSON string payload to represent a new pet
         *         String petJson = "{ " +
         *                 "\"id\": 12345, " +
         *                 "\"name\": \"Buddy\", " +
         *                 "\"status\": \"available\" " +
         *                 "}";
         *
         *         // Send POST request and capture the response directly
         *         Response response = RestAssured
         *             .given()
         *                 .contentType("application/json")
         *                 .body(petJson)
         *             .post("/pet");
         *
         *         // Process the response
         *         int statusCode = response.getStatusCode();
         *         String responseBody = response.getBody().asString();
         *
         *         // Print status and response body
         *         System.out.println("Status Code: " + statusCode);
         *         System.out.println("Response Body: " + responseBody);
         *
         *         // Extract specific fields if needed
         *         int id = response.jsonPath().getInt("id");
         *         String name = response.jsonPath().getString("name");
         *         String status = response.jsonPath().getString("status");
         *
         *         // Simple assertions
         *         if (statusCode == 200 && id == 12345 && "Buddy".equals(name) && "available".equals(status)) {
         *             System.out.println("Test Passed");
         *         } else {
         *             System.out.println("Test Failed");
         *         }
         *     }
         * }
         */

    }


    /**
     * Testcase 2:
     * Perform a PUT request to update a pet with existing ID
     * Verify the status code is 200 and content type is application.json
     * Verify the response body matches your request body
     */
    @Test
    public void test2() {
        // Set the base URI for the Petstore API
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        // JSON payload to update the pet's details
        String updatedPetJson = "{ " +
                "\"id\": 12345, " +
                "\"name\": \"BuddyUpdated\", " +
                "\"status\": \"sold\" " +
                "}";

        // Send PUT request and validate response with given-when-then syntax
        given()
                .contentType("application/json")  // Specify JSON content type
                .body(updatedPetJson)             // Set the JSON payload
                .when()
                .put("/pet")                      // PUT request to update the pet
                .then()
                .statusCode(200)                  // Validate status code 200
                .body("id", equalTo(12345))       // Verify the pet ID in the response
                .body("name", equalTo("BuddyUpdated")) // Verify updated name
                .body("status", equalTo("sold")); // Verify updated status
    }

    //--------Option two -----
    /**
     * import io.restassured.RestAssured;
     * import io.restassured.response.Response;
     *
     * public class PetStoreTest {
     *
     *     public static void main(String[] args) {
     *         // Set the base URI
     *         RestAssured.baseURI = "https://petstore.swagger.io/v2";
     *
     *         // JSON payload to update the pet's details
     *         String updatedPetJson = "{ " +
     *                 "\"id\": 12345, " +
     *                 "\"name\": \"BuddyUpdated\", " +
     *                 "\"status\": \"sold\" " +
     *                 "}";
     *
     *         // Send PUT request and capture the response directly
     *         Response response = RestAssured
     *             .given()
     *                 .contentType("application/json")
     *                 .body(updatedPetJson)
     *             .put("/pet");
     *
     *         // Process the response
     *         int statusCode = response.getStatusCode();
     *         String responseBody = response.getBody().asString();
     *
     *         // Print status and response body
     *         System.out.println("Status Code: " + statusCode);
     *         System.out.println("Response Body: " + responseBody);
     *
     *         // Extract specific fields if needed
     *         int id = response.jsonPath().getInt("id");
     *         String name = response.jsonPath().getString("name");
     *         String status = response.jsonPath().getString("status");
     *
     *         // Simple assertions
     *         if (statusCode == 200 && id == 12345 && "BuddyUpdated".equals(name) && "sold".equals(status)) {
     *             System.out.println("Test Passed");
     *         } else {
     *             System.out.println("Test Failed");
     *         }
     *     }
     * }
     */

}
