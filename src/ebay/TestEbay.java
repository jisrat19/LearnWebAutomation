package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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

    /**
     * A Ebay user should be able to successfully search in the search box functionality
     *
     * @throws InterruptedException
     */

    @Test
    public static void checkEbaySearchBoxFunctionality() throws InterruptedException {
        //user should be able to successfully land in the Ebay homepage
        //user is able to click on the search box
        //user is able to write in the search box
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("microwave oven");
        Thread.sleep(4000);
        //user is able to click non the search button
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        Thread.sleep(4000);
        // user should be able to see the  "Microwaves" word after landing in the homepage
        String expectedText = "Microwaves";
        //verify user is successfully locate the "Microwaves" word
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

    @Test(enabled = false)
    public static void checkEbayShoppingCartFunctionality() throws InterruptedException {
        //user should be able to successfully land in the Ebay homepage
        Thread.sleep(4000);
        // user should be able to click in the Ebay search box and write the product in the searchbar
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("iphone 13");
        Thread.sleep(4000);
        // user is able to click in the search button
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        Thread.sleep(10000);
        //user should be able to land in the iphone 13 oven page
        //user is able to click in the chosen microwave oven from that page
        driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[2]/div/div[2]/a/h3")).click();
        Thread.sleep(20000);
        //user able to click on the shopping cart button
        driver.findElement(By.xpath("//*[@id=\"atcRedesignId_btn\"]")).click();
        Thread.sleep(1000);
        //user should be able to click on the "Go to the shopping cart"
        driver.findElement(By.xpath("//*[@id=\"atcRedesignId_overlay-atc-container\"]/div/div[1]/div[2]/div[2]/a[2]/span/span")).click();
        Thread.sleep(4000);
        //verify the user is successfully add the product in the shopping cart
        String expectedText = "Subtotal";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[3]/div/div[2]/div[4]/div[1]/span/span/span")).getText();

        Assert.assertEquals(actualText, expectedText);
        driver.close();


    }

    /**
     * @throws InterruptedException
     */
    @Test
    public static void checkEbayRemoveSection() throws InterruptedException {
        //user should be able to successfully land in the Ebay homepage
        // user is able to click on the Home & garden in the Ebay HomePage
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")).click();
        Thread.sleep(4000);
        //user should be able to click in the "furniture" link after landing in the  Home & Garden page
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]/div[2]")).click();
        Thread.sleep(4000);
        //user is able to click in the "End Tables" after landing from the furniture page
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[5]/div[2]")).click();
        Thread.sleep(4000);
        // user is able to click item from the "Best Selling" section
        driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[2]-0-1-12-list\"]/li[3]/div/a/div")).click();
        Thread.sleep(4000);
        // user is able to click in the "add to cart"
        driver.findElement(By.xpath("//*[@id=\"s0-0-18-5-11-26-106-2[1]-atcBtn\"]")).click();
        Thread.sleep(4000);
        // user is able to click in the "add to cart" on the top of the page
        driver.findElement(By.xpath("//i[@id='gh-cart-n']")).click();
        Thread.sleep(4000);
        //a user able to remove item from the shopping cart by clicking "remove" button
        driver.findElement(By.xpath("//button[@data-test-id='cart-remove-item']")).click();
        Thread.sleep(4000);
        // user should be able to see item has removed successfully
        String expectedText = "You don't have any items in your cart.";
        String actualText = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[3]/div[1]/div/div[1]/span/span/span")).getText();
        Assert.assertEquals(actualText, expectedText);
    }


    /**
     * @throws InterruptedException
     */
    @Test
    public static void checkEbayItemPageMissing() throws InterruptedException {

        //user should be able to successfully land in the Ebay homepage
        // user is able to click on the Toy section in the Ebay HomePage
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a")).click();
        Thread.sleep(7000);
        //user is able to click on the "Doll & Teddy Bear" in the shop by category section
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[2]/div[2]")).click();
        Thread.sleep(7000);
        //user is able to click on the "Barbie Contemporary Dolls" link in the "shop by category" section
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[4]/div[2]")).click();
        Thread.sleep(7000);
        String expectedTest = "Looks like this page is missing. If you still need help, visit our ";
        //verify the user is able to see the message of "page not found"
        String actualText = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/h1")).getText();
        Thread.sleep(7000);
        Assert.assertEquals(actualText, expectedTest);
    }



    /**
     * @throws InterruptedException
     */
    @Test
    public static void checkEbayShoppingCartFunction() throws InterruptedException {
        //user should be able to successfully land in the Ebay homepage
        // user is able to click on the Home & garden in the Ebay HomePage
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")).click();
        Thread.sleep(4000);
        //user should be able to click in the "furniture" link after landing in the  Home & Garden page
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]/div[2]")).click();
        Thread.sleep(4000);
        //user is able to click in the "End Tables" after landing from the furniture page
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[5]/div[2]")).click();
        Thread.sleep(4000);
        // user is able to click item from the "Shop by Shape" section
        driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[0]-0-1[0]-0-12-list\"]/li[1]/a/p")).click();
        //user is able to select item from best-selling section
        driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[1]-0-1-12-list\"]/li[1]/div/a/div")).click();
        Thread.sleep(4000);
        // user is able to click in the "add to cart"
        driver.findElement(By.xpath("//*[@id=\"s0-0-18-5-11-26-106-2[1]-atcBtn\"]")).click();
        Thread.sleep(4000);
        // user is able to click in the "add to cart" on the top of the page
        driver.findElement(By.xpath("//i[@id='gh-cart-n']")).click();
        Thread.sleep(5000);
        String expectedText="Shopping cart (1 item)";
        String actualText =driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[1]/h1")).getText();

        Assert.assertEquals(actualText,expectedText);
    }
}







