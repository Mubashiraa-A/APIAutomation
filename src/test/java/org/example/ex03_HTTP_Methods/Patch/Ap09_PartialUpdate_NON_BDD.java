package org.example.ex03_HTTP_Methods.Patch;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Ap09_PartialUpdate_NON_BDD {
    RequestSpecification r;
    Response response;
    ValidatableResponse v;

    String bookingID = "1299";
    String token = "0835454eb4efa1c";


    String baseUri = "https://restful-booker.herokuapp.com";
    String basePath = "/booking/" + bookingID;
    String payload = "{  \"additionalneeds\": \"dinner\"\n}";


    @Test
    public void update_non_bdd() {

        r = RestAssured.given();
        r.baseUri(baseUri).basePath(basePath);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);
        r.body(payload);

        response = r.log().all().patch();


        v = response.then();
        v.log().all();
        v.statusCode(200);


    }
}
