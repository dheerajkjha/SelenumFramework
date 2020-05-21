package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotEmailConfirmationSentPage {

    private WebDriver driver;
    private By emailSentSuccessMessage = By.id("content");

    public ForgotEmailConfirmationSentPage(WebDriver driver){
        this.driver = driver;
    }

    public String getEmailSentSuccessMessage(){
        return driver.findElement(emailSentSuccessMessage).getText();
    }
}
