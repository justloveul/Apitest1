package com.api.common;

import io.restassured.response.Response;

import static io.restassured.RestAssured.get;

public class GetRequest {
    public static Response getRequest(String url){
        Response response = get(url);
        return response;
    }
}
