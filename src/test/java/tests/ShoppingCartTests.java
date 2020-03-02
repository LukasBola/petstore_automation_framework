package tests;

import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.objects.*;
import utils.testng.listeners.TestListener;

import static org.testng.Assert.assertEquals;

public class ShoppingCartTests extends TestBase {

    @Issue("DEFECT-3")
    @TmsLink("ID-3")
    @Severity(SeverityLevel.MINOR)
    @Test
    public void addSmallAngelFishToTheCartWithoutLoginIn() {
        LandingPage landingPage = new LandingPage();
        landingPage
                .clickOnEnterStoreLink()
                .clickOnQuickFishMenu()
                .clickOnAngelFishId()
                .clickOnSmallAngelFishAddToCartButton()
                .clickOnProceedToCheckOutButton();

        LoginPage loginPage = new LoginPage();
        String warningMessage = loginPage.getWarningMessage();
        assertEquals(warningMessage, "You must sign on before attempting to check out. Please sign on and try checking out again.");
    }
}