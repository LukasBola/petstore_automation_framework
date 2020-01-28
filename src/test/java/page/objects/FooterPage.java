package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {

    @FindBy (id = "Banner")
    WebElement bannerAfterLogin;

    private WebDriver driver;

    public FooterPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isBannerAfterLoginIsDisplayed(){
        boolean isDisplayd = bannerAfterLogin.isDisplayed();
        return isDisplayd;
    }
}
