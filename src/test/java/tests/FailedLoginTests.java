package tests;

import driver.manager.DriverUtils;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import page.objects.LoginPage;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;

public class FailedLoginTests extends TestBase {

    @Issue("DEFECT-1")
    @TmsLink("ID-1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("The goal of this test is to log in using invalid username and password" +
            "and check if warning message is displayed.")
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage
                .typeIntoUsernameField("invalidUsername")
                .typeIntoPasswordField("inavalidPassword")
                .clickLoginButton();

        assertEquals(loginPage.getWarningMessage(), "Invalid username or password. Signon failed.");
    }
}
