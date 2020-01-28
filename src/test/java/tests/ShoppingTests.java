package tests;

import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.TopMenuPage;

public class ShoppingTests extends TestBase{

    @Test
    public void addSmallAngelFishToTheCartWithoutLoginIn(){
        driver.navigate().to(petStoreUrl);
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnQuickFishMenu();
        sleep();

    }
}
