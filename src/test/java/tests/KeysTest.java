package tests;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTests {

    @Test
    public void testBackSpace(){
        KeyPressesPage keyPressespage = homePage.clickKeyPresses();
        keyPressespage.enterText("B" + Keys.BACK_SPACE);
        assertEquals(keyPressespage.getMessage(), "You entered: BACK_SPACE", "Message does not match");
    }


    @Test
    public void testPi(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPi();
    }
}
