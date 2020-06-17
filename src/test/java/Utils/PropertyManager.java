package Utils;

import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {

    public static PropertyManager INSTANCE = new PropertyManager();
    private Properties properties = new Properties();

    PropertyManager(){
        try{
            InputStream file = this.getClass().getClassLoader().getResourceAsStream("Environment/config.properties");
            properties.load(file);
        } catch(Exception e){
            System.out.println("error" + e);
        }
    }

    public static PropertyManager getInstance()
    {
        return INSTANCE;
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }

}
