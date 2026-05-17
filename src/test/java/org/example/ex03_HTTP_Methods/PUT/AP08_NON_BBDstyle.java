package org.example.ex03_HTTP_Methods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class AP08_NON_BBDstyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse v;

    String bookingID="1071";
    String token="50bca35244f2771";


    String baseUri="https://restful-booker.herokuapp.com";
    String basePath ="/booking/"+bookingID;
    String payload = "{\n" +
            "    \"firstname\" : \"kay\",\n" +
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
    public void update_non_bdd() {

        r = RestAssured.given();
            r.baseUri(baseUri).basePath(basePath);
            r.contentType(ContentType.JSON);
            r.cookie("token",token);
            r.body(payload);

        response = r.log().all().put();


        v=response.then();
             v.log().all();
             v.statusCode(200);



    }
}
