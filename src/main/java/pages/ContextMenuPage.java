package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By contextMenuBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickContextMenu(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(contextMenuBox)).perform();
    }

    public String getContextPopUpMessage(){
        return driver.switchTo().alert().getText();
    }

    public void acceptContextPopUp(){
        driver.switchTo().alert().accept();
    }
}
