package page.objects;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static generic.assertions.AssertWebElement.assertThat;

public class FooterPage extends BasePage {

    @FindBy (css = "#Banner img[src*='dog']")
    WebElement bannerAfterLogin;

    @Step("Checking if Dog Banner is displayd on page footer after log in.")
    public boolean isBannerAfterLoginIsDisplayed(){
        WaitForElement.waitUntilElementIsVisible(bannerAfterLogin);
        boolean isDisplayed = bannerAfterLogin.isDisplayed();
        log().info("Returning status of banner after login: {}", isDisplayed);
        return isDisplayed;
    }

    @Step("Assert that element dog banner is displayed")
    public FooterPage assertThatDogBannerIsDisplayed(){
        log().info("Checking if dog banner is displayed");
        WaitForElement.waitUntilElementIsVisible(bannerAfterLogin);
        assertThat(bannerAfterLogin).isDisplayed();
        return this;
    }
}
