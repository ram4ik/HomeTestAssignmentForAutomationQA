package com.automation.android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTestExample {

    public static void main(String[] args) throws MalformedURLException {
        // Set the Desired Capabilities for the Android device
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel XL API 32");
        capabilities.setCapability("appPackage", "com.android.calculator2"); // Example package (Calculator)
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator"); // Example activity

        // Initialize the AndroidDriver with the Appium server URL and capabilities
        AndroidDriver driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities
        );

        // Find elements and perform actions
        WebElement digit7 = driver.findElement(By.id("digit_7")); // Example element ID
        WebElement digitPlus = driver.findElement(By.id("op_add")); // Example element ID
        WebElement digit2 = driver.findElement(By.id("digit_2")); // Example element ID
        WebElement equalsButton = driver.findElement(By.id("eq")); // Example element ID
        WebElement resultField = driver.findElement(By.id("result")); // Example element ID

        digit7.click();
        digitPlus.click();
        digit2.click();
        equalsButton.click();

        String result = resultField.getText();
        System.out.println("Result: " + result);

        // Close the driver session
        driver.quit();
    }
}

