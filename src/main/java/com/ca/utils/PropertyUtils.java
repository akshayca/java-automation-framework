package com.ca.utils;

import com.ca.enums.ConfigProperties;
import com.ca.exceptions.PropertyFileUsageException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class PropertyUtils {

    private PropertyUtils(){

    }
    private static Properties property = new Properties();
    private static final Map<String, String> CONFIGMAP = new HashMap<>();

    static {
        try{
            FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
            property.load((file));
            for (Map.Entry<Object, Object> entry : property.entrySet()) {
                CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim()); //remove the trailing and leading spaces
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String get(ConfigProperties key)  {
        if(Objects.isNull(CONFIGMAP.get(key.name().toLowerCase())) || Objects.isNull(key)){
            throw new PropertyFileUsageException("Property name " + key + " is not found, please check config.properties");
        }
        return CONFIGMAP.get(key.name().toLowerCase());

    }

}
