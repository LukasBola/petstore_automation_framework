package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class ShoppingCartPage extends BasePage {

    @FindBy(css = "#Cart a[href*='newOrderForm']")
    WebElement proceedToCheckOutButton;

    public CheckoutPage clickOnProceedToCheckOutButton() {
        WaitForElement.waitUntilElementIsClickable(proceedToCheckOutButton);
        proceedToCheckOutButton.click();
        log().info("Clicked on Proceed to checkout button at the Shopping cart page.");
        return new CheckoutPage();
    }
}
