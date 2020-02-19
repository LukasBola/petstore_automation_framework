package tests;

import org.testng.annotations.Test;
import page.objects.FooterPage;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase {

    @Test
    public void asUserLogInUsingValidLoginAndPassword() {
        LandingPage landingPage = new LandingPage();
        boolean isBannerAfterLoginDisplayd = landingPage
                .clickOnEnterStoreLink()
                .clickOnSignInLink()
                .typeIntoUsernameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickLoginButton()
                .isBannerAfterLoginIsDisplayed();

        assertTrue(isBannerAfterLoginDisplayd);

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignOutLink();
    }
}
