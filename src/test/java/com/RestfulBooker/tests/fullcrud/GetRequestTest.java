package com.RestfulBooker.tests.fullcrud;

import com.RestfulBooker.endpoints.APIConstants;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetRequestTest {

    @Test
    public void get_Test()
    {
        RequestSpecification r = RestAssured.given();
        r.baseUri(APIConstants.BASE_URL);
        r.basePath(APIConstants.CREATE_GET_POST_URL);
        r.when().get();
        r.then().log().all();

    }
}
