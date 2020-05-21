package tests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTests {

    @Test
    public void testWysiwyg(){
        var wysiwygEditorPage = homePage.clickWysiwygEditor();
        wysiwygEditorPage.clearTextArea();
        wysiwygEditorPage.setTextArea("Hello");
        wysiwygEditorPage.clickIncreaseIndentButton();
        wysiwygEditorPage.setTextArea(" World");
        assertEquals(wysiwygEditorPage.getTextFromEditor(), "Hello World", "Text is not matching");
    }
}
