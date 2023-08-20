package com.automation.apitests.tests;

import api.endpoints.ApiEndpoints;
import com.automation.apitests.base.BaseAPITest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import org.apache.http.HttpStatus;
import api.utils.APIUtils;

@Feature("API Tests")
@Story("Test Resources")
public class TestResources extends BaseAPITest {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Ramill")
    @TmsLink("TEST-4")
    @Link("https://gorest.co.in/public/v2/users")
    @Description("Get positive users")
    public void testPositiveGetUsers() {
        APIUtils.verifyStatusCode(ApiEndpoints.USERS.getPath(), HttpStatus.SC_OK);
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Ramill")
    @TmsLink("TEST-5")
    @Link("https://gorest.co.in/public/v2/posts")
    @Description("Get positive posts")
    public void testPositiveGetPosts() {
        APIUtils.verifyStatusCode(ApiEndpoints.POSTS.getPath(), HttpStatus.SC_OK);
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Owner("Ramill")
    @TmsLink("TEST-6")
    @Link("https://gorest.co.in/public/v2/comments")
    @Description("Get positive comments")
    public void testPositiveGetComments() {
        APIUtils.verifyStatusCode(ApiEndpoints.COMMENTS.getPath(), HttpStatus.SC_OK);
    }

    @Test
    @Owner("Ramill")
    @TmsLink("TEST-7")
    @Link("https://gorest.co.in/public/v2/todos")
    @Severity(SeverityLevel.NORMAL)
    @Description("Get positive ToDos")
    public void testPositiveGetTodos() {
        APIUtils.verifyStatusCode(ApiEndpoints.TODOS.getPath(), HttpStatus.SC_OK);
    }
}
