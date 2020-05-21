package tests;

import base.BaseTests;
import com.sun.source.tree.AssertTree;
import org.testng.annotations.Test;
import pages.ForgotEmailConfirmationSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.*;

public class ForgotEmailTest extends BaseTests {

    @Test
    public void testForgotPasswordEmailSent(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.enterEmailAddress("tau@example.com");
        ForgotEmailConfirmationSentPage forgotEmailConfirmationSentPage = forgotPasswordPage
                .clickRetrievePasswordButton();
        //assertTrue(forgotEmailConfirmationSentPage.getEmailSentSuccessMessage()
                //.contains("Your e-mail's been sent!"), "The message is incorrect");
        assertEquals(forgotEmailConfirmationSentPage.getEmailSentSuccessMessage()
        , "Your e-mail's been sent!", "The message is incorrect!");
    }
}
