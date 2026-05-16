package org.example.ex02_RestAssured_Basics;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Pincode_Api_MulTestCase {

    @Test
    public void test_positive_tc1() {
        String Pincode="90210";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/us/"+Pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }


    @Test
    public void test_negative_tc2() {

        String Pincode="muaa";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/us/"+Pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }
}
