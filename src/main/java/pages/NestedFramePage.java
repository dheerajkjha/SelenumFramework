package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramePage {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramePage(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftPaneText(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getBottomPaneText(){
        driver.switchTo().frame(bottomFrame);
        String text = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        return text;
    }
}
