package api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GetTestWithPathVariables extends BaseAPIClass {

    @Test
    public void getSingleUser(){
        RestAssured.baseURI="https://reqres.in/api/users";

        RequestSpecification httpRequest = RestAssured.given();

        //Create a variables
        String id = "2";
        Response response = httpRequest.request(Method.GET, id);
        LOGGER.debug(response.getBody().asString());

        Assert.assertEquals(response.getStatusCode(),200);

        JsonPath jasonPath= response.jsonPath();
        String expectedEmailId = jasonPath.getString("data.email");

        String expectedEmail="janet.weaver@reqres.in";
        Assert.assertEquals(expectedEmail,expectedEmailId);

    }

}
