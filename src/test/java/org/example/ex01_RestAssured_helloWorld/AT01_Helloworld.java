package org.example.ex01_RestAssured_helloWorld;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class AT01_Helloworld {
    @Test
    public void TestHelloWold() {

        //Rest Assured
        RestAssured
                //step 1- Given -- pre-request
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")

                //step 2- When -- Action?
                .when()
                .get()

                //step 3 - Then  -- Validation
                .then()
                .statusCode(201);

    }
}
