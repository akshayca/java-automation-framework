package com.ca.driver;

import com.ca.enums.ConfigProperties;
import com.ca.exceptions.BrowserInvocationFailedException;
import com.ca.factories.DriverFactory;
import com.ca.utils.PropertyUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.Objects;

public class Driver {

    public static void initDriver(String browser,String version)  {


        if(Objects.isNull(DriverManager.getDriver())) {
            try {
                DriverManager.setDriver(DriverFactory.getDriver(browser,version));

            } catch (MalformedURLException e) {
                throw new BrowserInvocationFailedException("Please check the capabilities of browser");
            }
            DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
        }
    }

    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
