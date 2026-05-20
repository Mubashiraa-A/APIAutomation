package org.example.ex05_Test_AssertionOrValidation;

import static org.assertj.core.api.Assertions.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AP024_AssertJ_Assertion {
    RequestSpecification r;
    Response response;
    ValidatableResponse v;

    Integer bookingID;
    String firstname;
    String lastname;


    String payload_POST = "{\n" +
            "    \"firstname\" : \"mubaaa\",\n" +
            "    \"lastname\" : \"Dutta\",\n" +
            "    \"totalprice\" : 123,\n" +
            "    \"depositpaid\" : false,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2024-01-01\",\n" +
            "        \"checkout\" : \"2024-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Lunch\"\n" +
            "}";


    @Test
    public void test_create_post() {

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/").basePath("/booking");
        r.contentType(ContentType.JSON);
        r.body(payload_POST).log().all();

        response = r.when().log().all().post();

        v = response.then().log().all().statusCode(200);


        //  Extract Response
        // booking ID, firstname, lastname, checkin dates.

        // Extraction
        // Concept #1 - Normal( TestNG or Assertj) IS IMP
        bookingID = response.then().extract().path("bookingid");
       String firstName=response.then().extract().path("booking.firstname");
       String lastName=response.then().extract().path("booking.lastname");
        System.out.println("boking id"+bookingID+" first name is "+firstName+" Last name is "+lastName);

        // Concept #2 - (Jsonpath class) Another mechanism to extract the Keys, value by JSON Path
        JsonPath jp= new JsonPath(response.asString());
        String bookingID1= jp.getString("bookingid");


        assertThat(jp.getString("booking.lastname")).isEqualTo("Dutta");
        assertThat(jp.getInt("booking.totalprice")).isNotNull();
        assertThat(jp.getBoolean("booking.depositpaid")).isFalse();


        // TestNG - Extract the details of the firstname, bookingId, lastname from Response.
        // TestNG Assertions - 75%
        // SoftAssert vs HardAssert (90%)
        // This means that if any assertion fails,
        // the remaining statements in that test method will not be executed.
//        Assert.assertEquals(firstname,"mubaaa");
//        Assert.assertEquals(lastname,"Dutta");
//        Assert.assertNotNull(bookingID);
//        if(!firstname.contains("mubaaa")){
//            Assert.fail("Failed kar diya Test");
//
//        }


        assertThat(bookingID).isNotZero().isNotNull().isPositive();
        assertThat(bookingID)
                .isNotNull()
                .isBetween(0, 9999);


        assertThat(firstName).isNotBlank().isNotEmpty().isNotNull().isEqualTo("mubaaa");

    }
}



