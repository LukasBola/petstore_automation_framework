package page.objects;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class TopMenuPage extends BasePage {

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    WebElement signInLink;

    @FindBy(css = "#MenuContent a[href*='signoff']")
    WebElement signOutLink;

    @FindBy(css = "#QuickLinks img[src*='fish']")
    WebElement quickFishMenu;

    @Step("Click on Sing In link at top page menu.")
    public LoginPage clickOnSignInLink() {
        WaitForElement.waitUntilElementIsClickable(signInLink);
        signInLink.click();
        log().info("Clicked on Sign In link at Top Page Menu.");
        return new LoginPage();
    }

    @Step("Click on Sing out link at top page menu.")
    public LoginPage clickOnSignOutLink() {
        WaitForElement.waitUntilElementIsClickable(signOutLink);
        signOutLink.click();
        log().info("Clicked on Sign Out link at Top Page Menu.");
        return new LoginPage();
    }

    @Step("Click on quick Fish Menu link at the top page menu.")
    public FishListPage clickOnQuickFishMenu() {
        WaitForElement.waitUntilElementIsClickable(quickFishMenu);
        quickFishMenu.click();
        log().info("Clicked on quick Fish Menu link at the Top Page Menu.");
        return new FishListPage();
    }
}
