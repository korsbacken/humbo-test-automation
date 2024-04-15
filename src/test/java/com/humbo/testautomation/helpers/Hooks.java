package com.humbo.testautomation.helpers;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setup() {

//        EdgeOptions options = new EdgeOptions();
        ChromeOptions options = new ChromeOptions();
//        FirefoxOptions options = new FirefoxOptions();

//        options.addArguments("--start-maximized");

//        options.addArguments("--incognito");    //Chrome
//        options.addArguments("--inPrivate");    //Edge

        options.addArguments("--headless");        
//        options.addArguments("--headless=new");
//        options.addArguments("--window-size=1920,1080");

//        options.addArguments("-private");       //Firefox
//        options.addArguments("-height=1080");   //Firefox
//        options.addArguments("-width=1920");    //Firefox
//        options.addArguments("-headless");      //Firefox

//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--disable-gpu");

        driver = new ChromeDriver(options);
//        driver = new FirefoxDriver(options);
//        driver = new EdgeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Browser has opened");
        System.out.println("Browser Name is : "+((RemoteWebDriver) driver).getCapabilities().getBrowserName().toLowerCase());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            System.out.println("Browser is closing");
            driver.quit();
        }
        System.out.println("Browser has closed");
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
