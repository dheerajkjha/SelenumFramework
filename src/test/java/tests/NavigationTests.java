package tests;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickHiddenElement();
        getWindowManager().navigateBack();
        getWindowManager().refreshPage();
        getWindowManager().navigateForward();
        getWindowManager().goToPage("https://google.co.in");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
