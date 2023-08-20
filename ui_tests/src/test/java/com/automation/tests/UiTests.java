package com.automation.tests;

import com.automation.home.HomePage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Feature("UI Tests")
@Story("Test UI Resources")
public class UiTests {

    private HomePage homePage;

    @BeforeMethod
    public void setup() {
        homePage = new HomePage();
    }

    @Test(description = "Verify correct title of the page")
    @Description("Test to verify the title of the page")
    public void testPageTitle() {
        homePage.openPage("https://gorest.co.in/");
        homePage.getPageTitle().shouldHave(Condition.text("GraphQL and REST API for Testing and Prototyping"));
    }

    @Test(description = "Verify presence of an element on the page")
    @Description("Test to verify the presence of a specific element on the page")
    public void testPresenceOfElement() {
        homePage.openPage("https://gorest.co.in/");
        homePage.getSomeElement().shouldHave(Condition.text("Go REST"));
    }
}
