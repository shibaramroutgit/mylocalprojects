package org.example;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

/**
 * Rest API has a static method to use directly we need to import RestAssured as static
 * import static io.restassured.RestAssured.*;
 * We use Given() When() Then() to do API operation
 *
 * Given() is used to set the parameters
 * When() is used to set End Point and method type (Get, post, put, delete)
 * Then() is used to validate the responses
 *
 *
 *
 */

public class App1
{
    public static void main( String[] args )
    {
        RestAssured.baseURI="https://rahulshettyacademy.com";
        given().queryParam("key","qaclick123").body("{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Frontline house by Shibaram\",\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                "  \"address\": \"29, side layout, cohen 09\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}").
                when().post("maps/api/place/add/json").
                then().assertThat().statusCode(200);

    }
}
