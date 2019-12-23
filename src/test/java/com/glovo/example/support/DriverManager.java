package com.glovo.example.support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public WebDriver getDriver(String browserType) {
        if (StringUtils.equalsAnyIgnoreCase(browserType, "chrome")) {
            return getChromeDriver();
        } else {
            getFirefoxDriver();
        }
        return null;
    }

    private void getFirefoxDriver() {
    }

    private WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
