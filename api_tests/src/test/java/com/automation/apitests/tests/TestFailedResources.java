package com.automation.apitests.tests;

import api.endpoints.ApiEndpoints;
import api.utils.APIUtils;
import api.utils.CustomException;
import com.automation.apitests.base.BaseAPITest;
import io.qameta.allure.*;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

@Feature("API Tests")
@Story("Test Failed Resources")
public class TestFailedResources extends BaseAPITest {

    @Test(expectedExceptions = CustomException.class, expectedExceptionsMessageRegExp = "Expected failed message")
    @Severity(SeverityLevel.MINOR)
    @Owner("Ramill")
    @TmsLink("TEST-9")
    @Issue("BUG-9")
    @Link("https://gorest.co.in/public/v2/users")
    @Description("Post to users is always failed, since there is no Authentication")
    public void testPositivePostUsers() {
        APIUtils.verifyForFailedStatusCode(ApiEndpoints.USERS.getPath(), HttpStatus.SC_OK);
    }
}
