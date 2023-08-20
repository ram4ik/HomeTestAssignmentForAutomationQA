package com.automation.ios.controller;

import java.nio.file.Path;

import static com.automation.ios.utils.TestUtils.resourcePathToLocalPath;

public class TestResources {

    public static Path testAppZip() {
        return resourcePathToLocalPath("apps/TestApp.app.zip");
    }
}
