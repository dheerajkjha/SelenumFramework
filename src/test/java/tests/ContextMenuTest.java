package tests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {

    @Test
    public void testContextMenuPopUpMessage(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.clickContextMenu();
        String message = "You selected a context menu";
        assertEquals(contextMenuPage.getContextPopUpMessage(), message, "Message is different");
        contextMenuPage.acceptContextPopUp();
    }
}
