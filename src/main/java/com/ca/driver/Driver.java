package com.ca.driver;

import com.ca.utils.ReadPropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Objects;

public class Driver {

    public static void initDriver() throws Exception {
        if(Objects.isNull(DriverManager.getDriver())){
            WebDriverManager.chromedriver().setup();
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().get(ReadPropertyFile.getValue("url"));
        }
    }

    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
