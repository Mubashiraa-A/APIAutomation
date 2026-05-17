package org.example.ex03_HTTP_Methods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class AP07_NON_BBDstyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse v;

    String baseUri = "https://restful-booker.herokuapp.com";
    String basePath = "/booking";
    String payload = "{\n" +
            "    \"firstname\" : \"Jim\",\n" +
            "    \"lastname\" : \"Brown\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";


    @Test
    public void post_NON_BBDstyle() {
        r = RestAssured.given();
        r.baseUri(baseUri).basePath(basePath);
        r.contentType(ContentType.JSON).body(payload);

        response = r.when().log().all().post();

        v = response.then();
        v.statusCode(200);


    }
}
