package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class AngelfishListPage {

    @FindBy(css = "a.Button[href$='EST-2']")
    WebElement smallAngelFishAddToCartButton;

    public AngelfishListPage( ){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnSmallAngelFishAddToCartButton() {
        WaitForElement.waitUntilElementIsClickable(smallAngelFishAddToCartButton);
        smallAngelFishAddToCartButton.click();
    }
}
