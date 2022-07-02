package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBase {


    public static WebDriver driver;
    String browserName = "chrome";
    //String url = "https://www.amazon.com/";
     String url = "https://www.ebay.com/";
    //String url = "http://automationpractice.com/";


    @BeforeTest
    public void setUpAutomation() {
        System.out.println("***************** Automation Started *******************");
    }

    @AfterTest(alwaysRun = true)
    public void tearDownAutomation() {
       // driver.close();
        System.out.println("***************** Automation End *******************");
    }


    @BeforeTest
    public void setUp() {
        if (this.browserName == "chrome") {
            setUpChromeBrowser();
        } else  {
            System.out.println("Not found");

        }
        //  navigate to amazon.com
        driver.manage().window().maximize();
        driver.get(this.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();
    }


    public static void setUpChromeBrowser() {
        String chromeDriverPath = "../LearnWebAutomation/BrowserDriver/MAC/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
    }
}
