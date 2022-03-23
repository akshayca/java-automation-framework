package com.ca.listeners;
import com.ca.reports.ExtentReport;
import org.testng.*;

import static com.ca.enums.LogType.*;
import static com.ca.reports.FrameworkLogger.log;

import java.util.Arrays;

public class ListenerClass implements ITestListener, ISuiteListener{

    @Override
    public void onStart(ISuite suite) {
        ExtentReport.initReports();
    }

    @Override
    public void onFinish(ISuite suite) {
        ExtentReport.flushReports();

    }
    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getMethod().getDescription());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //ExtentLogger.pass(result.getMethod().getMethodName() +" is passed");
        log(PASS,result.getMethod().getMethodName() +" is passed");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        log(FAIL,result.getMethod().getMethodName() +" is failed");
        log(FAIL,result.getThrowable().toString());
        log(FAIL, Arrays.toString(result.getThrowable().getStackTrace()));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //ExtentLogger.skip(result.getMethod().getMethodName() +" is skipped");
        log(SKIP,result.getMethod().getMethodName() +" is skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
