package com.glovo.example.specs;

import com.glovo.example.support.DriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BasicTest {

    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        DriverManager driverManager = new DriverManager();
        driver = driverManager.getDriver("chrome");
    }

    @Before
    public void before() {
        driver.get("file:///Users/emirates/Documents/glovo/test/src/test/resources/employees.html");
    }

    @AfterClass
    public static void afterClass() {
        driver.close();
        driver.quit();
    }
}
