package tests;

import org.testng.annotations.*;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.*;

public class FailedLoginTests extends TestBase {

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
}
