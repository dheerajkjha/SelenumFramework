package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.*;


public class DropDownTest extends BaseTests {

    @Test
    public void testSelectOption(){
        String option = "Option 2";
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.selectFromDropdown(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "More than one option selected");
        assertTrue(selectedOptions.contains(option), "Incorrect selection");
    }
}
