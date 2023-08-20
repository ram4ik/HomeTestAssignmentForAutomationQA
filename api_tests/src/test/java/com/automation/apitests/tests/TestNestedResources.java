package com.automation.apitests.tests;

import api.endpoints.NestedApiEndpoints;
import com.automation.apitests.base.BaseAPITest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import org.apache.http.HttpStatus;
import api.utils.APIUtils;

@Feature("API Tests")
@Story("Test Nested Resources")
public class TestNestedResources extends BaseAPITest {

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    @Owner("Ramill")
    @TmsLink("TEST-1")
    @Issue("BUG-1234")
    @Description("Get positive nested posts")
    public void testPositiveGetPosts() {
        APIUtils.verifyStatusCode(NestedApiEndpoints.USER_POSTS.getPath(), HttpStatus.SC_OK);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Owner("Ramill")
    @TmsLink("TEST-2")
    @Description("Get positive nested comments")
    public void testPositiveGetComments() {
        APIUtils.verifyStatusCode(NestedApiEndpoints.POST_COMMENTS.getPath(), HttpStatus.SC_OK);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Owner("Ramill")
    @TmsLink("TEST-3")
    @Description("Get positive nested ToDos")
    public void testPositiveGetTodos() {
        APIUtils.verifyStatusCode(NestedApiEndpoints.USER_TODOS.getPath(), HttpStatus.SC_OK);
    }
}
