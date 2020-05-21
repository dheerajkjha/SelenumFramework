package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailInputBox = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmailAddress(String emailID){
        driver.findElement(emailInputBox).sendKeys(emailID);
    }

    public ForgotEmailConfirmationSentPage clickRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new ForgotEmailConfirmationSentPage(driver);
    }

}
