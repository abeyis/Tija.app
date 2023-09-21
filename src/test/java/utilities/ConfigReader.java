
package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    static {
        String dosyaYolu = "configuration.properties";

        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * <h2>Get Property Value Method
     * <h2/>
     * 
     * <h4>Description Of Method :
     * <h4/>
     * This method using for getting relevant value from properties file
     * Returns the value of provided key
     * 
     * @param key
     * @return value of key parameter
     */
    public static String getProperty(String key) {
        String value = properties.getProperty(key);
        return value;
    }
}