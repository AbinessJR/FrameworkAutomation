package com.qa.testutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
    public static WebDriver getDriver(String browser) {
        WebDriver driver = null;
        switch (browser.toLowerCase()) {
            case "chrome":
               // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
                WebDriverManager.chromedriver().driverVersion("130.0.6723.92").setup();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser: " + browser);
        }
        return driver;
    }
}