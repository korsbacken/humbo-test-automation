package com.humbo.testautomation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/humbo/testautomation/resources/features", // Location to features
        glue = {"com.humbo.testautomation.stepDefinitions", "com.humbo.testautomation.helpers"}, // Package containing step definitions
        plugin = {"pretty", "html:target/cucumber-reports"} // Location to automatic reports after executing tests
)
public class RunCucumberTests {
}
