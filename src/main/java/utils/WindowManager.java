package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void navigateBack(){
        navigate.back();
    }

    public void navigateForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goToPage(String url){
        navigate.to(url);
    }

    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();

        System.out.println("Number of windows/tabs open: " + windows.size());

        System.out.println("Window Handles:");
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("Switching to Windows: " + window);
            driver.switchTo().window(window);

            System.out.println("Current Window Title: " + driver.getTitle());

            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }

    public void switchToNewTab(){
        var tabs = driver.getWindowHandles();
        tabs.forEach(driver.switchTo()::window);
        }
}
