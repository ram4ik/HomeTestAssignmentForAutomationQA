package com.automation.home;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private final SelenideElement pageTitle = $("body > div.container.pt-3 > h1");
    private final SelenideElement someElement = $("body > nav > div > a");

    public HomePage openPage(String url) {
        open(url);
        return this;
    }

    public SelenideElement getPageTitle() {
        return pageTitle;
    }

    public SelenideElement getSomeElement() {
        return someElement;
    }
}

