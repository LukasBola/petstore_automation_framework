package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

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
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getWarningMessage() {
        return warningMessage.getText();
    }
}
