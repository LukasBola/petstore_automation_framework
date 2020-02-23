package tests;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import page.objects.LoginPage;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase {

    @Test
    @Description("The goal of this test is to log in using valid username and password" +
            "and chceck if Dog banner is diplayd after login on page footer.")
    public void asUserLogInUsingValidLoginAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        boolean isBannerAfterLoginDisplayd = loginPage
                .typeIntoUsernameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickLoginButton()
                .isBannerAfterLoginIsDisplayed();

        assertTrue(isBannerAfterLoginDisplayd);
    }
}
