package tests;

import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.Assert.assertEquals;

public class ShoppingCartTests extends TestBase {

    @Test
    public void addSmallAngelFishToTheCartWithoutLoginIn() {
        driver.navigate().to(petStoreUrl);
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnQuickFishMenu();

        FishListPage fishListPage = new FishListPage(driver);
        fishListPage.clickOnAngelFishId();

        AngelfishListPage angelfishListPage = new AngelfishListPage(driver);
        angelfishListPage.clickOnSmallAngelFishAddToCartButton();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.clickOnProceedToCheckOutButton();

        LoginPage loginPage = new LoginPage(driver);
        String warningMessage = loginPage.getWarningMessage();
        assertEquals(warningMessage, "You must sign on before attempting to check out. Please sign on and try checking out again.");
    }
}
