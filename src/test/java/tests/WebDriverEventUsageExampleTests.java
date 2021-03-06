package tests;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.events.EventFiringWebDriver;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;
        import driver.listeners.DriverEventListener;

        import java.util.concurrent.TimeUnit;

        import static org.testng.AssertJUnit.assertEquals;

public class WebDriverEventUsageExampleTests {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        DriverEventListener driverEventListener = new DriverEventListener();
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        driver = eventFiringWebDriver.register(driverEventListener);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://przyklady.javastart.pl/jpetstore/");
    }

    @Test
    public void webDriverEventListenerUsageTest() {
        driver.findElement(By.cssSelector("#Content a")).click();
        driver.findElement(By.cssSelector("#MenuContent a[href*='signonForm']")).click();

        driver.findElement(By.name("username")).sendKeys("NotExistingLogin");
        driver.findElement(By.name("password")).sendKeys("NotProperPassword");

        driver.findElement(By.name("signon")).click();

        assertEquals(driver.findElement(By.cssSelector("#Content ul[class='messages'] li")).getText(), "Invalid username or password. Signon failed.");
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}