package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class FishListPage extends BasePage {

    @FindBy(css = "#Catalog table a[href*='productId=FI-SW-01']")
    WebElement angelFishId;

    public AngelfishListPage clickOnAngelFishId() {
        WaitForElement.waitUntilElementIsClickable(angelFishId);
        angelFishId.click();
        log().info("Clicked on Angelfish product Id at Fish list page.");
        return new AngelfishListPage();
    }
}
