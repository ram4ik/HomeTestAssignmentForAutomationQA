package com.automation.apitests.tests;

import api.executor.APIExecutor;
import com.automation.apitests.base.BaseAPITest;
import org.testng.annotations.Test;

public class TestResources extends BaseAPITest {

    private final APIExecutor apiExecutor = new APIExecutor();

    @Test
    public void testPositiveGetUsers() {
        apiExecutor
                .get("/public/v2/users")
                .then()
                .statusCode(200);
    }

    @Test
    public void testPositiveGetPosts() {
        apiExecutor
                .get("/public/v2/posts")
                .then()
                .statusCode(200);
    }

    @Test
    public void testPositiveGetComments() {
        apiExecutor
                .get("/public/v2/comments")
                .then()
                .statusCode(200);
    }

    @Test
    public void testPositiveGetTodos() {
        apiExecutor
                .get("/public/v2/todos")
                .then()
                .statusCode(200);
    }
}
