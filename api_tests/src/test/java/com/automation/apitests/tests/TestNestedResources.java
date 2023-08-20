package com.automation.apitests;

import org.junit.Test;
import static io.restassured.RestAssured.given;

public class TestNestedResources extends BaseAPITest {

    @Test
    public void testPositiveGetPosts() {
        given()
                .log().everything()
                .when()
                .get("/public/v2/users/2638/posts")
                .then()
                .statusCode(200);
    }

    @Test
    public void testPositiveGetComments() {
        given()
                .log().everything()
                .when()
                .get("/public/v2/posts/2638/comments")
                .then()
                .statusCode(200);
    }

    @Test
    public void testPositiveGetTodos() {
        given()
                .log().everything()
                .when()
                .get("/public/v2/users/2638/todos")
                .then()
                .statusCode(200);
    }
}
