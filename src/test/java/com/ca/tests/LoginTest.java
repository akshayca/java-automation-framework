package com.ca.tests;

import com.ca.driver.Driver;
import com.ca.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class LoginTest extends BaseTest{

 @Test
    public void test1(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
    }

}
