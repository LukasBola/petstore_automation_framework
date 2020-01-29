package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelfishListPage {

    @FindBy(css = "a.Button[href$='EST-2']")
    WebElement smallAngelFishAddToCartButton;

    public WebDriver driver;

    public AngelfishListPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSmallAngelFishAddToCartButton() {
        smallAngelFishAddToCartButton.click();
    }
}
