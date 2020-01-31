package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {

    @FindBy (id = "Banner")
    WebElement bannerAfterLogin;

    public FooterPage (){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public boolean isBannerAfterLoginIsDisplayed(){
        boolean isDisplayd = bannerAfterLogin.isDisplayed();
        return isDisplayd;
    }
}
