package com.humbo.testautomation.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class startPage {

    static WebDriver driver;

    @Given("user has navigated to the start page {string}")
    public void user_has_navigated_to_the_start_page(String url) {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        options.addArguments("--incognito");
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        driver.get(url);
    }
    @Then("user should see correct page title {string}")
    public void user_should_see_correct_page_title(String pageTitle) {
        Assertions.assertEquals(pageTitle, driver.getTitle());
    }
}
