package com.automation.android.base;

import managers.AppiumServerManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseAndroid {

    @BeforeClass
    public static  void beforeClass() {

        AppiumServerManager.startAppiumServer();
    }

    @AfterClass
    public static void afterClass() {

        AppiumServerManager.stopAppiumServer();
    }

}
