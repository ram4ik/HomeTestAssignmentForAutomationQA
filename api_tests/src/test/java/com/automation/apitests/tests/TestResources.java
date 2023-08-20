package com.automation.apitests;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestResources extends BaseAPITest {

    @Test
    public void testPositiveGetUsers() {
        given()
                .log().everything()
                .when()
                .get("/public/v2/users")
                .then()
                .statusCode(200);
    }

    @Test
    public void testPositiveGetPosts() {
        given()
                .log().everything()
                .when()
                .get("/public/v2/posts")
                .then()
                .statusCode(200);
    }

    @Test
    public void testPositiveGetComments() {
        given()
                .log().everything()
                .when()
                .get("/public/v2/comments")
                .then()
                .statusCode(200);
    }

    public void testPositiveGetTodos() {
        given()
                .log().everything()
                .when()
                .get("/public/v2/todos")
                .then()
                .statusCode(200);
    }
}
