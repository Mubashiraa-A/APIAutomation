package org.example.ex03_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class AP04_GET_BBDstyle {

    @Test
    public void test_GET_POSITIVE(){
        String pincode = "560058";
        pincode = "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

    @Test
    public void test_GET_POSITIVE2(){
        String pincode = "560058";
        pincode = "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
