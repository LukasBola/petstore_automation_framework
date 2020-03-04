package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class AngelfishListPage extends BasePage {

    @FindBy(css = "a.Button[href$='EST-2']")
    WebElement smallAngelFishAddToCartButton;

    public ShoppingCartPage clickOnSmallAngelFishAddToCartButton() {
        WaitForElement.waitUntilElementIsClickable(smallAngelFishAddToCartButton);
        smallAngelFishAddToCartButton.click();
        log().info("Clicked on small Angelfish at Angelfish list page and clicked on Add to cart button at Angelfish list page.");
        return new ShoppingCartPage();
    }
}
