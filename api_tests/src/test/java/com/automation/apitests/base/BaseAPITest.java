package com.automation.apitests;

import io.restassured.RestAssured;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseAPITest {
    @BeforeClass
    public static void setup() {

        RestAssured.baseURI = "https://gorest.co.in";
    }

    @AfterClass
    public static void teardown() {

    }
}

