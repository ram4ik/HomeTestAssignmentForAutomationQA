package com.automation.apitests.base;

import io.restassured.RestAssured;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseAPITest {
    @BeforeClass
    public static void setup() {

        RestAssured.baseURI = "https://gorest.co.in";
    }

    @AfterClass
    public static void teardown() {

    }
}

