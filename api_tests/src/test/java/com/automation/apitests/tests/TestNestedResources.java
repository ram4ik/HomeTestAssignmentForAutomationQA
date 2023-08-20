package com.automation.apitests.tests;

import api.endpoints.NestedApiEndpoints;
import com.automation.apitests.base.BaseAPITest;
import org.testng.annotations.Test;
import api.executor.APIExecutor;
import org.apache.http.HttpStatus;

public class TestNestedResources extends BaseAPITest {

    private final APIExecutor apiExecutor = new APIExecutor();

    @Test
    public void testPositiveGetPosts() {
        apiExecutor
                .get(NestedApiEndpoints.USER_POSTS.getPath())
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void testPositiveGetComments() {
        apiExecutor
                .get(NestedApiEndpoints.POST_COMMENTS.getPath())
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void testPositiveGetTodos() {
        apiExecutor
                .get(NestedApiEndpoints.USER_TODOS.getPath())
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
