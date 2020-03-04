package page.objects;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LandingPage extends BasePage {

    @FindBy(css = "#Content a")
    WebElement enterStoreLink;

    @Step("Click on Enter Store link at Landing Page")
    public TopMenuPage clickOnEnterStoreLink() {
        WaitForElement.waitUntilElementIsClickable(enterStoreLink);
        enterStoreLink.click();
        log().info("Clicked on enter store link.");
        return new TopMenuPage();
    }
}
