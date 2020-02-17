package driver.manager;

import driver.BrowserFactory;
import driver.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;

    private DriverManager() {
    }

    public static WebDriver getWebDriver() {
        if (driver == null) {
            driver = BrowserFactory.getBrowser(BrowserType.FIREFOX);
        }
        return driver;
    }

    public static void disposeDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }
}
