package com.automation.apitests.tests;

import api.endpoints.ApiEndpoints;
import com.automation.apitests.base.BaseAPITest;
import org.testng.annotations.Test;
import org.apache.http.HttpStatus;
import api.utils.APIUtils;

public class TestResources extends BaseAPITest {

    @Test
    public void testPositiveGetUsers() {
        APIUtils.verifyStatusCode(ApiEndpoints.USERS.getPath(), HttpStatus.SC_OK);
    }

    @Test
    public void testPositiveGetPosts() {
        APIUtils.verifyStatusCode(ApiEndpoints.POSTS.getPath(), HttpStatus.SC_OK);
    }

    @Test
    public void testPositiveGetComments() {
        APIUtils.verifyStatusCode(ApiEndpoints.COMMENTS.getPath(), HttpStatus.SC_OK);
    }

    @Test
    public void testPositiveGetTodos() {
        APIUtils.verifyStatusCode(ApiEndpoints.TODOS.getPath(), HttpStatus.SC_OK);
    }
}
