package org.example.ex03_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class AP05_NON_BBDstyle {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String pincode;

    @Test
    public void Positive_GET_NON_BDDstyle(){
        pincode= "90210";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://api.zippopotam.us");
        requestSpecification.basePath("/us/"+pincode);

        response = requestSpecification.when().get();

        validatableResponse = response.then();
        validatableResponse.log().all();
        validatableResponse.statusCode(200);
    }


    @Test
    public void Negative_NON_BBDstyle(){
        pincode="";
        requestSpecification= RestAssured.given();
        requestSpecification.baseUri("https://api.zippopotam.us");
        requestSpecification.basePath("/us/"+pincode);

        response=requestSpecification.when().log().all().get();

        validatableResponse= response.then();
        validatableResponse.log().all().statusCode(404);
    }
}
