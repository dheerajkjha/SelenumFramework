package tests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var hiddenElement = homePage.clickDynamicLoading().clickHiddenElement();
        hiddenElement.clickStart();
        assertEquals(hiddenElement.getMessage(), "Hello World!", "Message is not correct");
    }

    @Test
    public void testWaitUntilVisible(){
        var visibleElement = homePage.clickDynamicLoading().clickRenderedElement();
        visibleElement.clickStart();
        assertEquals(visibleElement.getMessage(), "Hello World!", "Message not displayed");
    }
}
