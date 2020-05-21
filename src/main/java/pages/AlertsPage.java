package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By alertMessage = By.id("result");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlertPopup(){
        driver.findElement(triggerAlertButton).click();
    }

    public void acceptAlertPopUp(){
        driver.switchTo().alert().accept();
    }

    public String getAlertMessage(){
        return driver.findElement(alertMessage).getText();
    }

    public void triggerConfirmPopup(){
        driver.findElement(triggerConfirmButton).click();
    }

    public String getConfirmMessage(){
        return driver.switchTo().alert().getText();
    }

    public void dismissConfirmPopUp(){
        driver.switchTo().alert().dismiss();
    }

    public void triggerPromptPopUp(){
        driver.findElement(triggerPromptButton).click();
    }

    public void enterTextInPromptPopUp(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void acceptPromptPopUp(){
        driver.switchTo().alert().accept();
    }

    public String getPromptConfirmationMessage(){
        return driver.findElement(alertMessage).getText();
    }
}
