package com.sheikotester.tests;

import com.sheikotester.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.getDriver();
        driver.get("http://seleniumdemo.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
