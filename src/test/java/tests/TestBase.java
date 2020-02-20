package tests;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static navigation.ApplicationURLs.APPLICATION_URL;
import static navigation.ApplicationURLs.LOGIN_URL;

public class TestBase {

    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(APPLICATION_URL);
    }

    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }

    public void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
