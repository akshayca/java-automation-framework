package com.ca.tests;

import com.ca.driver.Driver;
import com.ca.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class LoginTest2 extends BaseTest{

    @Test
    public void test1(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing", Keys.ENTER);
    }
    @Test
    public void test2(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing 2", Keys.ENTER);
    }
}
