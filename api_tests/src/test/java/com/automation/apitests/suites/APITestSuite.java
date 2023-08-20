package com.automation.apitests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestResources.class,
        TestNestedResources.class
        // Add more test classes here
})
public class APITestSuite {

}

