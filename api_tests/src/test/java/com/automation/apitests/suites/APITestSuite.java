package com.automation.apitests.suites;

import api.utils.CustomTestListener;
import com.automation.apitests.tests.TestNestedResources;
import com.automation.apitests.tests.TestResources;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.testng.annotations.Listeners;

@Listeners(CustomTestListener.class)
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestResources.class,
        TestNestedResources.class
        // Add more test classes here
})
public class APITestSuite {

}

