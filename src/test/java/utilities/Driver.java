package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

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

        String browser = ConfigReader.getProperty("browser");

        if (driver == null) {

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
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
