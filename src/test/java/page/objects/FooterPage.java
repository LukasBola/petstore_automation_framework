package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class FooterPage {

    @FindBy (id = "Banner")
    WebElement bannerAfterLogin;

    public FooterPage (){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public boolean isBannerAfterLoginIsDisplayed(){
        WaitForElement.waitUntilElementIsVisible(bannerAfterLogin);
        boolean isDisplayd = bannerAfterLogin.isDisplayed();
        return isDisplayd;
    }
}
