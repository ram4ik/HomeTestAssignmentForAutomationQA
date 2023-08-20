package com.automation.apitests.tests;

import api.endpoints.ApiEndpoints;
import api.executor.APIExecutor;
import com.automation.apitests.base.BaseAPITest;
import org.testng.annotations.Test;
import org.apache.http.HttpStatus;

public class TestResources extends BaseAPITest {

    private final APIExecutor apiExecutor = new APIExecutor();

    @Test
    public void testPositiveGetUsers() {
        apiExecutor
                .get(ApiEndpoints.USERS.getPath())
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void testPositiveGetPosts() {
        apiExecutor
                .get(ApiEndpoints.POSTS.getPath())
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void testPositiveGetComments() {
        apiExecutor
                .get(ApiEndpoints.COMMENTS.getPath())
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void testPositiveGetTodos() {
        apiExecutor
                .get(ApiEndpoints.TODOS.getPath())
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
