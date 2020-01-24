package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    private WebDriver driver;
    String petStoreUrl = "http://przyklady.javastart.pl/jpetstore/";


    @BeforeMethod
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:/_luke/_test/chromedriver_win32_79/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(petStoreUrl);
    }

    @AfterMethod
    public void afterTest(){
        driver.close();
        driver.quit();
    }

    public void sleep() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword(){
        WebElement enterStoreLink =  driver.findElement(By.cssSelector("#Content a"));
        enterStoreLink.click();

        WebElement signInLink = driver.findElement(By.cssSelector("#MenuContent a[href*='signonForm']"));
        signInLink.click();

        WebElement usernameField = driver.findElement(By.cssSelector("#Catalog input[name*='username']"));
        usernameField.clear();
        usernameField.sendKeys("invalidUserName");

        WebElement passwordField = driver.findElement(By.cssSelector("#Catalog input[name*='password']"));
        passwordField.clear();
        passwordField.sendKeys("invalidPassword");

        WebElement loginButton = driver.findElement(By.cssSelector("#Catalog input[name*='signon']"));
        loginButton.click();

        String message = driver.findElement(By.cssSelector("#Content li")).getText();

        assertEquals(message, "Invalid username or password. Signon failed.");
    }

    @Test
    public void asUserLogInUsingValidLoginAndPassword(){
        WebElement enterStoreLink =  driver.findElement(By.cssSelector("#Content a"));
        enterStoreLink.click();

        WebElement signInLink = driver.findElement(By.cssSelector("#MenuContent a[href*='signonForm']"));
        signInLink.click();

        WebElement usernameField = driver.findElement(By.cssSelector("#Catalog input[name*='username']"));
        usernameField.clear();
        usernameField.sendKeys("j2ee");

        WebElement passwordField = driver.findElement(By.cssSelector("#Catalog input[name*='password']"));
        passwordField.clear();
        passwordField.sendKeys("j2ee");

        WebElement bannerAfterLogin = driver.findElement(By.id("Banner"));
        assertTrue(bannerAfterLogin.isDisplayed());

    }
}
