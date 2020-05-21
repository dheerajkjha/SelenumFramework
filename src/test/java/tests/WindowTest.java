package tests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WindowTest extends BaseTests {

    @Test
    public void testWindowTabs(){
        var buttonPage = homePage.clickDynamicLoading().rightClickHiddenElement();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(),"Start button is not displayed");
    }
}
