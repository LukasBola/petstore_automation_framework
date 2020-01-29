package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishListPage {

    @FindBy(css = "#Catalog table a[href*='productId=FI-SW-01']")
    WebElement angelFishId;

    public WebDriver driver;

    public FishListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAngelFishId() {
        angelFishId.click();
    }
}
