package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    @FindBy(css = "#Content a")
    WebElement enterStoreLink;

    @FindBy(css = "#Catalog table a[href*='productId=FI-SW-01']")
    WebElement angelFishId;

    @FindBy(css = "#Content a[href *='ItemId=EST-2']")
    WebElement smallAngelFishAddToCartButton;

    @FindBy(css = "#Cart a[href*='newOrderForm']")
    WebElement proceedToCheckOutButton;

    @FindBy(css = ".messages > li")
    WebElement signOnBeforeAttemptingToCheckOutMessage;

    private WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnEnterStoreLink() {
        enterStoreLink.click();
    }

    public void clickOnAngelFishId() {
        angelFishId.click();
    }

    public void clickOnSmallAngelFishAddToCartButton() {
        smallAngelFishAddToCartButton.click();
    }

    public void clickOnProceedToCheckOutButton() {
        proceedToCheckOutButton.click();
    }

    public String getSignOnBeforeAttemptingToCheckOutMessage() {
        return signOnBeforeAttemptingToCheckOutMessage.getText();
    }
}
