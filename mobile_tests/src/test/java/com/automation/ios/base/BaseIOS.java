package com.automation.ios.base;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.jupiter.api.AfterAll;

import java.time.Duration;

public class BaseIOS {

    protected static AppiumDriverLocalService service;
    protected static IOSDriver driver;
    protected static final int PORT = 4723;
    public static final String DEVICE_NAME = System.getenv("IOS_DEVICE_NAME") != null
            ? System.getenv("IOS_DEVICE_NAME")
            : "iPhone 14 Pro";
    public static final String PLATFORM_VERSION = System.getenv("IOS_PLATFORM_VERSION") != null
            ? System.getenv("IOS_PLATFORM_VERSION")
            : "16.4";
    public static final Duration WDA_LAUNCH_TIMEOUT = Duration.ofMinutes(4);
    public static final Duration SERVER_START_TIMEOUT = Duration.ofMinutes(3);

    /**
     * Starts a local server.
     *
     * @return service instance
     */
    public static AppiumDriverLocalService startAppiumServer() {
        service = new AppiumServiceBuilder()
                .withIPAddress("127.0.0.1")
                .usingPort(PORT)
                .withTimeout(SERVER_START_TIMEOUT)
                .build();
        service.start();
        return service;
    }

    /**
     * finishing.
     */
    @AfterAll
    public static void afterClass() {
        if (driver != null) {
            driver.quit();
        }
        if (service != null) {
            service.stop();
        }
    }
}
