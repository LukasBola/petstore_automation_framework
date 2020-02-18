package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class LoginPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#Catalog input[name*='username']")
    private WebElement usernameField;

    @FindBy(css = "#Catalog input[name*='password']")
    private WebElement passwordField;

    @FindBy(css = "#Catalog input[name*='signon']")
    private WebElement loginButton;

    @FindBy(css = "#Content li")
    private WebElement warningMessage;

    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void typeIntoUsernameField(String username) {
        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.clear();
        usernameField.sendKeys(username);
        logger.info("Typed user name: '{}' in username field.", username);
    }

    public void typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed password: '{}' in password field.", password);
    }

    public void clickLoginButton() {
        loginButton.click();
        logger.info("Clicked Login button at the login page.");
    }

    public String getWarningMessage() {
        WaitForElement.waitUntilElementIsVisible(warningMessage);
        String warningMessageText = warningMessage.getText();
        logger.info("Returned warning message: '{}' at the login page", warningMessageText);
        return warningMessageText;
    }
}
