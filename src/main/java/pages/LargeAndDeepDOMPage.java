package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LargeAndDeepDOMPage {

    private WebDriver driver;
    private By largeTable = By.id("large-table");

    public LargeAndDeepDOMPage(WebDriver driver){
        this.driver = driver;
    }
}
