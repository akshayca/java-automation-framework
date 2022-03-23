package com.ca.listeners;

import com.ca.enums.ConfigProperties;
import com.ca.utils.PropertyUtils;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {

    private int count=0;
    private int retries = 1;

    @Override
    public boolean retry(ITestResult iTestResult) {
        boolean value =false;

        if(PropertyUtils.get(ConfigProperties.RETRYFAILEDTESTS).equalsIgnoreCase("yes")) {
            value = count<retries ;
            count++;
        }
        return value;
    }
}
