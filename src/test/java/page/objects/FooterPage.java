package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FooterPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy (id = "Banner")
    WebElement bannerAfterLogin;

    public FooterPage (){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public boolean isBannerAfterLoginIsDisplayed(){
        WaitForElement.waitUntilElementIsVisible(bannerAfterLogin);
        boolean isDisplayd = bannerAfterLogin.isDisplayed();
        logger.info("Returning status of banner after login: {}", isDisplayd);
        return isDisplayd;
    }
}
