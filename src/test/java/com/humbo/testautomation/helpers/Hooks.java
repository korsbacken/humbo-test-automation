package com.humbo.testautomation.helpers;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class Hooks {

    private static WebDriver driver;

    OptionsManager options = new OptionsManager();

    @Before
    public void setup() throws Exception {
        String browser = "firefox";
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver(options.getChromeOptions());
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver(options.getEdgeOptions());
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver(options.getFirefoxOptions());
        } else {
            throw new Exception("Incorrect Browser");
        }
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Browser has opened");
        System.out.println("Test has started with browser: " + ((RemoteWebDriver) driver).getCapabilities().getBrowserName().toLowerCase());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
