package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTest extends BaseTests {

    @Test
    public void testHoverUserOne(){
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption figureCaption = hoversPage.hoverOverImage(1);
        assertTrue(figureCaption.isCaptionDisplayed(), "Caption is not displayed");
        assertEquals(figureCaption.getCaptionTitle(), "name: user1", "Title is incorrect");
        assertEquals(figureCaption.getLinkText(), "View profile", "Link Text is incorrect");
        assertEquals(figureCaption.getLink(), "https://the-internet.herokuapp.com/users/1", "Link is incorrect");
    }
}
