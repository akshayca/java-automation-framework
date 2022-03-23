package com.ca.driver;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class DriverManager {

    private DriverManager(){

    }
    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return dr.get();
    }

    public static void setDriver(WebDriver driverref){
        if(Objects.nonNull(driverref)) {
            dr.set(driverref);
        }
    }

    public static void unload(){
        dr.remove();
    }

}
