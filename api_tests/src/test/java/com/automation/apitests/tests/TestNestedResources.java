package com.automation.apitests.tests;

import com.automation.apitests.base.BaseAPITest;
import org.junit.Test;
import api.executor.APIExecutor;

public class TestNestedResources extends BaseAPITest {

    private final APIExecutor apiExecutor = new APIExecutor();

    @Test
    public void testPositiveGetPosts() {
        apiExecutor
                .get("/public/v2/users/2638/posts")
                .then()
                .statusCode(200);
    }

    @Test
    public void testPositiveGetComments() {
        apiExecutor
                .get("/public/v2/posts/2638/comments")
                .then()
                .statusCode(200);
    }

    @Test
    public void testPositiveGetTodos() {
        apiExecutor
                .get("/public/v2/users/2638/todos")
                .then()
                .statusCode(200);
    }
}
