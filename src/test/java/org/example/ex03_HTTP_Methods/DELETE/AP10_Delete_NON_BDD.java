package org.example.ex03_HTTP_Methods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class AP10_Delete_NON_BDD {
    RequestSpecification r;
    Response response;
    ValidatableResponse v;

    String bookingID = "801";
    String token = "b2c1f3dd101fefb";


    String baseUri = "https://restful-booker.herokuapp.com";
    String basePath = "/booking/" + bookingID;

    @Test
    public void delete_non_bdd() {
        r = RestAssured.given();
        r.baseUri(baseUri).basePath(basePath);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);

        response = r.delete();

        v = response.then().log().all().statusCode(201);
    }
}
