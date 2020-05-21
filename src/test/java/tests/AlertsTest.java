package tests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTests {

    @Test
    public void testAcceptAlert(){

        String actualMessage = "You successfuly clicked an alert";
        var jSAlertsPage = homePage.clickJavaScriptAlerts();
        jSAlertsPage.triggerAlertPopup();
        jSAlertsPage.acceptAlertPopUp();
        assertEquals(jSAlertsPage.getAlertMessage(), actualMessage,
                "Messages are not same");
    }

    @Test
    public void dismissAlert(){
        var jSAlertsPage = homePage.clickJavaScriptAlerts();
        jSAlertsPage.triggerConfirmPopup();
        String alertMessage = jSAlertsPage.getConfirmMessage();
        jSAlertsPage.dismissConfirmPopUp();
        assertEquals(alertMessage, "I am a JS Confirm",
                "Message is not correct");
    }

    @Test
    public void validatePromptMessage(){
        var jSAlertsPage = homePage.clickJavaScriptAlerts();
        jSAlertsPage.triggerPromptPopUp();
        jSAlertsPage.enterTextInPromptPopUp("Test Automation University");
        jSAlertsPage.acceptPromptPopUp();
        String confirmationMessage = jSAlertsPage.getPromptConfirmationMessage();
        assertEquals(confirmationMessage, "You entered: Test Automation University",
                "Message is incorrect");
    }
}
