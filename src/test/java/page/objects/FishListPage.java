package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class FishListPage {

    @FindBy(css = "#Catalog table a[href*='productId=FI-SW-01']")
    WebElement angelFishId;

    public FishListPage( ) {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAngelFishId() {
        WaitForElement.waitUntilElementIsClickable(angelFishId);
        angelFishId.click();
    }
}
