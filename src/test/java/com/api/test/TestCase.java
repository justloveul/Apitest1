package com.api.test;

import com.api.common.GetRequest;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class TestCase {

    @BeforeTest
    public void setUp(){
        RestAssured.baseURI = "https://api.douban.com/v2/book";

    }
    @Test
    public void test1(){
        GetRequest.getRequest("/1220562").then().body("rating.max", equalTo(10));

    }

}
