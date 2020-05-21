package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPageRenderedElement {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start > button");
    private By message = By.id("finish");

    public DynamicLoadingPageRenderedElement(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
    }

    public String getMessage(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(message));
        return driver.findElement(message).getText();
    }
}
