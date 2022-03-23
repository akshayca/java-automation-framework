package com.ca.tests;

import com.ca.driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.Map;

public class BaseTest {

    protected BaseTest(){
    }

    @BeforeMethod
    protected void setUp(Object[] data) throws Exception {
        Map<String,String> map = (Map<String,String>)data[0];
        Driver.initDriver(map.get("browser"),map.get("version"));
    }

    @AfterMethod
    protected void tearDown(){
        Driver.quitDriver();
    }

}
