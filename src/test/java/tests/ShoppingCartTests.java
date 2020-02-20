package tests;

import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.Assert.assertEquals;

public class ShoppingCartTests extends TestBase {

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