package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestEbay {

    static WebDriver driver;
    String browserName = "chrome";
    String url = "https://www.ebay.com/";
    static String actualText;

    @BeforeTest
    public void setUpAutomation() {
        System.out.println("***************** Automation Started *******************");
    }

    @AfterTest
    public void tearDownAutomation() {
        //driver.close();
        System.out.println("***************** Automation End *******************");
    }


    @BeforeTest
    public void setUp() throws InterruptedException {
        if (this.browserName == "chrome") {
            setUpChromeBrowser();
        } else {
            System.out.println("Not found");
        }
        //  navigate to amazon.com
        driver.get(this.url);
        driver.manage().window().maximize();

    }


    public static void setUpChromeBrowser() {
        String chromeDriverPath = "../LearnWebAutomation/BrowserDriver/MAC/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
    }


    @Test
    public static void checkEbaySignInFunctionality() {
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("microwave oven");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        String expectedText = "Microwaves";
        String actualText = driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/ul/li[3]/ul/li[2]/span")).getText();


        if (actualText.equals(expectedText)) {

            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        driver.close();
    }

    /**
     * A Ebay user should be able to successfully log in their ebay account
     *
     * @throws InterruptedException
     */

    @Test
    public static void checkEbaySignInBoxFunctionality() throws InterruptedException {
        Thread.sleep(4000);
        //find the text "My Ebay" in the Ebay Homepage
        driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).getText();
        Thread.sleep(4000);
        //click on the "My Ebay button"
        driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).click();
        Thread.sleep(4000);
        // enter the email address in the "username or email address" box
        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("jisrat19@gmail.com");
        Thread.sleep(5000);
        //click on the submit button
        driver.findElement(By.xpath("//*[@id=\"signin-continue-btn\"]")).submit();
        Thread.sleep(5000);
        // enter the password in the "password" box
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("London31");
        Thread.sleep(5000);
        //click on the sign-in button
        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();
        Thread.sleep(5000);
        //a user should be able to successfully log in the user-homepage and user should see his/her name in the top left of the ebay homepage
        String expectedText = "israt";
        Thread.sleep(10000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/b[1]")).getText();
        Thread.sleep(5000);
        //when the user see his/her name in the ebay homepage then user is successfully logged in
        if (actualText.equals(expectedText)) {

            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        driver.close();
    }

    @Test
    public static void checkSephoraShoppingCartFunctionality() throws InterruptedException {
        //user should be able to successfully land in the Ebay homepage
        Thread.sleep(4000);
        // user should be able to click in the Ebay search box and write the product in the searchbar
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("microwave oven");
        Thread.sleep(4000);
        // user is able to click in the search button
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        Thread.sleep(4000);
        //user should be able to land in the microwave oven page
        //user is able to click in the chosen microwave oven from that page
        driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[3]/div/div[2]/a/h3")).click();
        Thread.sleep(20000);
        //user able to click on the shopping cart button
                     //  driver.findElement(By.xpath("//*[@id=\"vi-viewInCartBtn\"]")).click();
        driver.findElement(By.className("btn btn-ter  vi-VR-btnWdth-XL")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"atcRedesignId_overlay-atc-container\"]/div/div[1]/div[2]/div[2]/a[2]/span/span")).click();
        Thread.sleep(4000);
        String expectedText = "Subtotal";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[3]/div/div[2]/div[4]/div[1]/span/span/span")).getText();

        if (actualText.equals(expectedText)) {

            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        driver.close();


    }


}







