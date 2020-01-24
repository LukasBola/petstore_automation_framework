package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeIntoUsernameField(String username) {
        WebElement usernameField = driver.findElement(By.cssSelector("#Catalog input[name*='username']"));
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void typeIntoPasswordField(String password) {
        WebElement passwordField = driver.findElement(By.cssSelector("#Catalog input[name*='password']"));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.cssSelector("#Catalog input[name*='signon']"));
        loginButton.click();
    }

    public String getWarningMessage(){
        String warningMessage = driver.findElement(By.cssSelector("#Content li")).getText();
        return warningMessage;
    }
}
