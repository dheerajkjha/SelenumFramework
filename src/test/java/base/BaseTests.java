package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    //@BeforeClass will run before any test class
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver(getChromeOptions());
        //Implicitly wait is set at the base class level and it will impact test run time
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        goHome();
        setCookie();

        // This command sets the size of the page in different modes like when opened in tablets, mobile
        //driver.manage().window().setSize(new Dimension(768, 1024));

        //List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println("Total number of links on the main web page: "+ links.size());

        //WebElement inputLink = driver.findElement(By.linkText("Inputs"));
        //inputLink.click();

        //driver.findElement(By.linkText("Shifting Content")).click();

        //driver.findElement(By.linkText("Example 1: Menu Element")).click();

        //List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        //System.out.println("Total Menu Items appearing are: " + menuItems.size());

        //System.out.println(driver.getTitle());
        // .quit() will end the session and .close will only close the browser

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    /*@AfterMethod
    public void takeScreenshots(){
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        //System.out.println("Screenshots taken: " + screenshot.getAbsolutePath());
        try{
            Files.move(screenshot, new File("resources/screenshots/test.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }*/

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            //System.out.println("Screenshots taken: " + screenshot.getAbsolutePath());
            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("disable-infobars");
        options.setHeadless(false);
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("TAU", "111")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

    /* public static void main(String[] args){
        BaseTests test = new BaseTests();
        test.setUp();
    }*/

}
