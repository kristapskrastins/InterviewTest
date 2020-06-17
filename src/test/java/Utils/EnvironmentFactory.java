package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnvironmentFactory {

    public static WebDriver driver;

    public static void initDriver(String type) {
        switch (type.toLowerCase()) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/Drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                throw new Error("Driver not supported");

        }
    }

    public static void deInitDriver() {
        driver.quit();
    }
}