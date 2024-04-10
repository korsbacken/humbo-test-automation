package com.humbo.testautomation.stepDefinitions;

import com.humbo.testautomation.helpers.Hooks;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class Top100Page {

    private final WebDriver driver;

    public Top100Page() {
        this.driver = Hooks.getDriver();
    }

    @Given("user has navigated to the Top 100 page {string}")
    public void user_has_navigated_to_the_top_100_page(String url) {
        driver.get(url);
    }
}
