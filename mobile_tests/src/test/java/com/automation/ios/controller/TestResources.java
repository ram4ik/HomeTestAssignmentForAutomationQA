package com.automation.ios;

import java.nio.file.Path;

import static com.automation.ios.TestUtils.resourcePathToLocalPath;

public class TestResources {

    public static Path testAppZip() {
        return resourcePathToLocalPath("apps/TestApp.app.zip");
    }
}
