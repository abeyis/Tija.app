package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;

    private Driver() {
    }

    /**
     * 
     * @return driver object
     */
    public static WebDriver getDriver() {

        String browser = System.getProperty("browser") != null ? System.getProperty("browser")
                : ConfigReader.getProperty("browser");

        if (driver == null) {

            switch (browser) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    driver = new ChromeDriver();

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt("implicitliyWait")));
        }
        return driver;
    }

    /**
     * Closes web page and resets driver object.
     * Assigns null to driver object.
     */
    public static void closeDriver() {

        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    /**
     * Closes web page and resets driver object.
     * Assigns null to driver object.
     */
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
