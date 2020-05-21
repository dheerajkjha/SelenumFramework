package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By hiddenElement = By.linkText("Example 1: Element on page that is hidden");
    private By renderedElement = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingPageHiddenElement clickHiddenElement(){
        driver.findElement(hiddenElement).click();
        return new DynamicLoadingPageHiddenElement(driver);
    }

    public DynamicLoadingPageRenderedElement clickRenderedElement(){
        driver.findElement(renderedElement).click();
        return new DynamicLoadingPageRenderedElement(driver);
    }

    public DynamicLoadingPageHiddenElement rightClickHiddenElement(){
        driver.findElement(hiddenElement).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadingPageHiddenElement(driver);

    }
}
