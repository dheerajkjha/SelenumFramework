package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputTextField = By.id("target");
    private By messageText = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputTextField).sendKeys(text);
    }

    public String getMessage(){
        return driver.findElement(messageText).getText();
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, "p"));
    }
}
