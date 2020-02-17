package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class TopMenuPage {

    @FindBy (css = "#MenuContent a[href*='signonForm']")
    WebElement signInLink;

    @FindBy (css = "#MenuContent a[href*='signoff']")
    WebElement signOutLink;

    @FindBy(css = "#QuickLinks img[src*='fish']")
    WebElement  quickFishMenu;

    public TopMenuPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnSignInLink() {
        WaitForElement.waitUntilElementIsClickable(signInLink);
        signInLink.click();
    }

    public void clickOnSignOutLink(){
        WaitForElement.waitUntilElementIsClickable(signOutLink);
        signOutLink.click();
    }

    public void clickOnQuickFishMenu(){
        WaitForElement.waitUntilElementIsClickable(quickFishMenu);
        quickFishMenu.click();
    }
}
