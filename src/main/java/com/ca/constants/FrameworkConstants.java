package com.ca.constants;

public final class FrameworkConstants {
    private FrameworkConstants(){}

    private static final String SOME_PATH = System.getProperty("user.dir")+"/src/test/resources/";

    public static String getSomePath(){
        return SOME_PATH;
    }
}
