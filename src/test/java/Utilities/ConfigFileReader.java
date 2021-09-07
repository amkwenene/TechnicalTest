package Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private static Properties properties;
    private final String propertyFilePath = System.getProperty("user.dir")+"/src/main/resources/config/config.properties";

    public ConfigFileReader(){

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }
    public  String getApplicationUrl(String key) {
        String url = properties.getProperty(key);
        if(url != null){
            return url;
        }
        else {
            throw new RuntimeException("Application Url not specified in the Configuration.properties file for the Key:url");
        }
    }
    public static String getTestDataPath()
    {
        String testdatapath = properties.getProperty("datasheetpath");
        if(testdatapath!=null)
        {
            return testdatapath;
        }
        else
        {
            throw new RuntimeException("Test Data Path is not specified in the Configuration file for the Key:testdatapath");
        }
    }

    /**
     * Getting Browser
     * @return
     */
    public String getBrowser()
    {
        String browser = properties.getProperty("browser");
        if(browser!=null)
        {
            return browser;
        }
        else
        {
            throw new RuntimeException("Browser not specified in the Configuration file for the Key:browser");
        }
    }

}
