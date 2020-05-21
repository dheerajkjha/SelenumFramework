package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By messageRibbon = By.id("flash-messages");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getRibbonMessage(){
        return driver.findElement(messageRibbon).getText();
    }
}
