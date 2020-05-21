package tests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTests {

    @Test
    public void testFramesText(){
        var framesPage = homePage.clickFrames();
        var nestedFramePage = framesPage.clickNestedFrames();
        assertEquals(nestedFramePage.getLeftPaneText(), "LEFT", "Left frame text is incorrect");
        assertEquals(nestedFramePage.getBottomPaneText(), "BOTTOM", "Bottom frame text is incorrect");
    }
}
