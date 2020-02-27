package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.util.Arrays;

public class DriverEventListener implements WebDriverEventListener {
    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("Trying to accept alert");
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("Alert was accepted");

    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("Alert was dismissed");
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        System.out.println("Trying to dismiss alert");
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver webDriver) {
        System.out.println("Trying to navigate to:" + url);
    }

    @Override
    public void afterNavigateTo(String url, WebDriver webDriver) {
        System.out.println("Navigated to: " + url);
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
        System.out.println("Trying to navigate back");
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        System.out.println("Navigated back");
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
        System.out.println("Trying to navigate forward");
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        System.out.println("Navigated forward");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
        System.out.println("Trying to refresh page");
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("Refreshed page");
    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Trying to find element with locator " + by.toString());
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Found element with locator " + by.toString());
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Trying to click on element");
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Clicked on element");
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        if (charSequences == null) {
            System.out.println("Trying to clear field with location " + webElement.getLocation());
        } else {
            System.out.println("Trying to type text " + Arrays.toString(charSequences));
        }
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        if (charSequences == null) {
            System.out.println("Cleared field with location " + webElement.getLocation());
        } else {
            System.out.println("Typed text " + Arrays.toString(charSequences));
        }
    }

    @Override
    public void beforeScript(String script, WebDriver webDriver) {
        System.out.println("Trying to execute script: " + script);
    }

    @Override
    public void afterScript(String script, WebDriver webDriver) {
        System.out.println("Executed script");
    }

    @Override
    public void beforeSwitchToWindow(String windowName, WebDriver webDriver) {
        System.out.println("Trying to switch to window " + windowName);
    }

    @Override
    public void afterSwitchToWindow(String windowName, WebDriver webDriver) {
        System.out.println("Switched window " + windowName);
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {

    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {
        System.out.println("Trying to get screenshot");
    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {
        System.out.println("Done screenshot");
    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {
        System.out.println("Trying to get text for WebElement");
    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {
        System.out.println("Taken text of WebElement. Text wast " + s);
    }
}
