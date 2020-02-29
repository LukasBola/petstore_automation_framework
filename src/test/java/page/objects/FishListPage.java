package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class FishListPage {

private Logger logger = LogManager.getLogger(FishListPage.class);

@FindBy(css = "#Catalog table a[href*='productId=FI-SW-01']")
    WebElement angelFishId;

public FishListPage( ) {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
        }

public AngelfishListPage clickOnAngelFishId() {
        WaitForElement.waitUntilElementIsClickable(angelFishId);
        angelFishId.click();
        logger.info("Clicked on Angelfish product Id at Fish list page.");
        return new AngelfishListPage();
        }
        }
