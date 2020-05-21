package tests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {

    @Test
    public void testUploadFile(){
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:/Users/djha/Work/SeleniumUploadFileTest.txt");
        assertEquals(fileUploadPage.getUploadedFileName(), "SeleniumUploadFileTest.txt",
                "Uploaded file name is correct");
    }
}
