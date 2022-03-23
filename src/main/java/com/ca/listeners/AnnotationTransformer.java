package com.ca.listeners;

import com.ca.utils.DataProviderUtils;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {

        iTestAnnotation.setDataProvider("getData");
        iTestAnnotation.setDataProviderClass(DataProviderUtils.class);
        iTestAnnotation.setRetryAnalyzer(RetryFailedTests.class);

    }
}
