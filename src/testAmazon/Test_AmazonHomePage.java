package testAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_AmazonHomePage {

static WebDriver driver;
    String browserName = "chrome";
    String url = "https://www.amazon.com/";
    static String actualText;

    @BeforeTest
    public void setUpAutomation() {
        System.out.println("***************** Automation Started *******************");
    }

    @AfterTest
    public void tearDownAutomation() {
        System.out.println("***************** Automation End *******************");
    }


    @BeforeTest
    public void setUp() throws InterruptedException {
        if (this.browserName == "chrome") {
            setUpChromeBrowser();
        }

        else {
            System.out.println("Not found");
        }
        //  navigate to amazon.com
        driver.get(this.url);
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }


    public static void setUpChromeBrowser() {
        String chromeDriverPath ="../LearnWebAutomation/BrowserDriver/MAC/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
    }
    @Test
    public static void tt(){
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");

        //  click on search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();


        // Verify searched product
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text : " + actualText);
        String expectedText = "\"iPhone 14\"";
        System.out.println("Expected Text : " + expectedText);

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

    }
    @Test
    public static void rr(){

        String actualProductName=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).getText();
        String expectedProductName="Amazon Basics";
        if (actualProductName.equals(expectedProductName)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test

    public static void testAmazonSearchBox() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("pens");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        String actualText = driver.findElement(By.xpath("//*[@id=\"p_76/1249170011\"]/span/a/div[2]/span")).getText();
        System.out.println("Actual Text : " + actualText);
        String expectedText = "All customers get FREE Shipping on orders over $25 shipped by Amazon";
        System.out.println("Expected Text : " + expectedText);

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
        Thread.sleep(5000);
        driver.close();

    }




        @Test
    public static void testSignIn() throws InterruptedException {
        //   setUp("chrome","https://www.amazon.com/");
        // Click on Hello SignIn
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        // Enter email/ phoneNumber
        driver.findElement(By.id("ap_email")).sendKeys("jisrat19@gmail.com");

        // Click continue button
        driver.findElement(By.cssSelector("#continue")).click();
        // Enter password
        driver.findElement(By.name("password")).sendKeys("Buffalo2020@");
        // Click SignIn Button
            driver.findElement(By.className("a-button-input")).click();

        // Verify successful login
            Thread.sleep(5000);
            String expectedText = "Hello, israt";
            String actualText = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
            System.out.println("Actual Text : " + actualText);

            Assert.assertEquals(actualText, expectedText, "SignIn not successful");
            Thread.sleep(5000);
            driver.close();


        }



}




