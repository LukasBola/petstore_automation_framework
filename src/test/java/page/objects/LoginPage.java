package page.objects;

import driver.manager.DriverManager;
import generic.assertions.AssertWebElement;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.rmi.runtime.Log;
import waits.WaitForElement;

public class LoginPage extends BasePage {

    @FindBy(css = "#Catalog input[name*='username']")
    private WebElement usernameField;

    @FindBy(css = "#Catalog input[name*='password']")
    private WebElement passwordField;

    @FindBy(css = "#Catalog input[name*='signon']")
    private WebElement loginButton;

    @FindBy(css = "#Content li")
    private WebElement warningMessage;

    @FindBy(css = "#Content ul[class='messages'] li")
    private WebElement messageLabel;

    @Step("Type into User Name Field {username}")
    public LoginPage typeIntoUsernameField(String username) {
        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.clear();
        usernameField.sendKeys(username);
        log().info("Typed user name: '{}' in username field.", username);
        return this;
    }

    @Step("Type into Password Field {password}")
    public LoginPage typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        log().info("Typed password: '{}' in password field.", password);
        return this;
    }

    @Step("Click on Login Button")
    public FooterPage clickLoginButton() {
        loginButton.click();
        log().info("Clicked Login button at the login page.");
        return new FooterPage();
    }

    @Step("Getting warning message from Login Page")
    public String getWarningMessage() {
        WaitForElement.waitUntilElementIsVisible(warningMessage);
        String warningMessageText = warningMessage.getText();
        log().info("Returned warning message: '{}' at the login page", warningMessageText);
        return warningMessageText;
    }

    @Step("Assert that warning message {warningMessage} is displayed")
    public LoginPage assertThatWarningIsDisplayd(String warningMessage) {
        log().info("Checking if warning message {} is displayed", warningMessage);
        WaitForElement.waitUntilElementIsVisible(messageLabel);
        AssertWebElement.assertThat(messageLabel).isDisplayed().hasText(warningMessage);
        return this;
    }
}

