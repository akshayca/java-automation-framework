package com.ca.tests;

import com.ca.driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {

    protected BaseTest(){
    }

    @BeforeMethod
    protected void setUp() throws Exception {
        Driver.initDriver();
    }

    @AfterMethod
    protected void tearDown(){
        Driver.quitDriver();
    }

}
