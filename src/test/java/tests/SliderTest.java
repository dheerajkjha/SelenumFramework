package tests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTest extends BaseTests {

    @Test
    public void testSliderValue(){
        String value = "4";
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.setSliderValue(value);
        assertEquals(horizontalSliderPage.getSliderValue(), "4", "Slider value is different");
    }
}
