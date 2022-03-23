package com.ca.constants;

import com.ca.enums.ConfigProperties;
import com.ca.utils.PropertyUtils;

public final class FrameworkConstants {
    private FrameworkConstants(){}

    private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources/";
    private static final int EXPLICITWAIT = 10;
    private static final String EXCELPATH = RESOURCESPATH+"/excel/testdata.xlsx";
    private static final String RUNMANGERSHEET = "RUNMANAGER";
    private static final String ITERATIONDATASHEET = "DATA";
    private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir")+"/TestResults/";
    private static String extentReportFilePath = "";


    public static int getExplicitwait() {
        return EXPLICITWAIT;
    }

    public static String getRunmangerDatasheet() {
        return RUNMANGERSHEET;
    }

    public static String getIterationDatasheet() {
        return ITERATIONDATASHEET;
    }

    public static String getExcelpath() {
        return EXCELPATH;
    }

    private static String createReportPath()  {
        if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")) {
            return EXTENTREPORTFOLDERPATH+System.currentTimeMillis()+"/index.html";
        }
        else {
            return EXTENTREPORTFOLDERPATH+"/index.html";
        }
    }


    public static String getExtentReportFilePath() {

        if(extentReportFilePath.isEmpty()) {
            extentReportFilePath = createReportPath();
        }
        return extentReportFilePath;
    }
}
