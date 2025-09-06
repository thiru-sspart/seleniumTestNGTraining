package org.rnd.utils;

import java.io.FileReader;
import java.util.Properties;

public class ResourceUtil {

    public Properties props = new Properties();

    public ResourceUtil()  {
        try {
            FileReader file = new FileReader("src/test/resources/application.properties");
            props.load(file);
        } catch (Exception ex){}
    }

    public String getProperty(String key) {
        return props.getProperty(key);
    }


}
