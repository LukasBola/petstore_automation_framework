package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    private WebDriver driver;
    String petStoreUrl = "http://przyklady.javastart.pl/jpetstore/";
    TestSettings testSettings = new TestSettings();

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", testSettings.chromePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }

    public void sleep() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {
        driver.navigate().to(petStoreUrl);
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUsernameField("invalidUsername");
        loginPage.typeIntoPasswordField("inavalidPassword");
        loginPage.clickLoginButton();

        assertEquals(loginPage.getWarningMessage(), "Invalid username or password. Signon failed.");
    }

    @Test
    public void asUserLogInUsingValidLoginAndPassword() {
        driver.navigate().to(petStoreUrl);
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUsernameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickLoginButton();

        FooterPage footerPage = new FooterPage(driver);
        assertTrue(footerPage.isBannerAfterLoginIsDisplayed());

        topMenuPage.clickOnSignOutLink();
    }
}
