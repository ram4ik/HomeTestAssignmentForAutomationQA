package com.automation.ios.tests;

import com.automation.ios.frame.AppIOSTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClipboardTest extends AppIOSTest {

    @Test
    public void verifySetAndGetClipboardText() {
        final String text = "Happy testing";
        driver.setClipboardText(text);
        assertEquals(driver.getClipboardText(), text);
    }
}
