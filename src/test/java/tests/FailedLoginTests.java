package tests;

import org.testng.annotations.*;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.*;

public class FailedLoginTests extends TestBase {

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink()
                .clickOnSignInLink()
                .typeIntoUsernameField("invalidUsername")
                .typeIntoPasswordField("inavalidPassword")
                .clickLoginButton();

        LoginPage loginPage = new LoginPage();
        assertEquals(loginPage.getWarningMessage(), "Invalid username or password. Signon failed.");
    }
}
