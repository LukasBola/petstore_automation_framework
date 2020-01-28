package tests;

import org.testng.annotations.*;
import page.objects.FooterPage;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.*;

public class PositiveLoginTests extends TestBase {

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
