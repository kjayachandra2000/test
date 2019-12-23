package com.glovo.example.support;

import com.glovo.example.specs.BasicTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageActions {

    protected WebDriver driver;

    public PageActions() {
        this.driver = BasicTest.driver;
    }

    protected void clickOn(By element) {
        driver.findElement(element).click();
    }

    protected String getText(WebElement element) {
        return element.getText();
    }

    protected List<WebElement> getElements(By element) {
        return driver.findElements(element);
    }
}
