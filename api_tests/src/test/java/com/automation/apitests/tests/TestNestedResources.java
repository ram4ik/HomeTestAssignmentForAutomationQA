package com.automation.apitests.tests;

import api.endpoints.NestedApiEndpoints;
import com.automation.apitests.base.BaseAPITest;
import org.testng.annotations.Test;
import org.apache.http.HttpStatus;
import api.utils.APIUtils;

public class TestNestedResources extends BaseAPITest {

    @Test
    public void testPositiveGetPosts() {
        APIUtils.verifyStatusCode(NestedApiEndpoints.USER_POSTS.getPath(), HttpStatus.SC_OK);
    }

    @Test
    public void testPositiveGetComments() {
        APIUtils.verifyStatusCode(NestedApiEndpoints.POST_COMMENTS.getPath(), HttpStatus.SC_OK);
    }

    @Test
    public void testPositiveGetTodos() {
        APIUtils.verifyStatusCode(NestedApiEndpoints.USER_TODOS.getPath(), HttpStatus.SC_OK);
    }
}
