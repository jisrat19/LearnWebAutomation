package sephora;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Test_Sephora {
    static WebDriver driver;
    String browserName = "chrome";
    String url = "https://www.sephora.com/";
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
    public static void checkSephoraSignIn() {

        driver.findElement(By.xpath("//*[@id=\"account_drop_trigger\"]/span/span")).click();
        String actualTest = driver.findElement(By.xpath("///*[@id=\"modal2Dialog\"]/div[1]/form/h2")).getText();
        String expectedText = "Sign in to Sephora";
        if (actualTest.equals(expectedText)) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }

        driver.close();

    }

    @Test
    public static void checkSephoraSkinCareText() {
        String actualText = driver.findElement(By.xpath("//*[@id=\"top_nav_drop_3_trigger\"]")).getText();
        String expectedTest = "Skincare";
        if (actualText.equals(expectedTest)) {

            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }

    }

    @Test
    public static void checkSephoraSkinCareClick() throws InterruptedException {
        // user click on makeup
        Thread.sleep(40000);
      //  Actions actions= new Actions(driver);
      //  actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"top_nav_drop_2_trigger\"]"))).perform();
      driver.findElement(By.xpath("//*[@id=\"top_nav_drop_2_trigger\"]")).click();
        Thread.sleep(4000);
       driver.findElement(By.xpath("//*[@id=\"top_nav_drop_2_trigger\"]")).click();
        Thread.sleep(4000);
        String expectedTest = "Makeup";
        String actualText = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div[1]")).getText();
        System.out.println("actual text "+actualText);

        if (actualText.equals(expectedTest)) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        driver.close();

    }

    @Test

    public static void checkSearchBoxFunctionality() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"site_search_input\"]")).sendKeys("nars concealer", Keys.ENTER);
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/main/div/div[1]/div/p/span")).getText();
        Thread.sleep(4000);
        String expectedText = "nars concealer";
        if (actualText.equals(expectedText)) {

            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        driver.close();
    }

    @Test
    public static void checkSephoraSignInBoxFunctionality() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"account_drop_trigger\"]/span/span")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"account_drop_trigger\"]/span/span")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"signin_username\"]")).sendKeys("jisrat19@gmail.com");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"signin_password\"]")).sendKeys("London31");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"modal1Dialog\"]/div[1]/form/button")).submit();
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"account_drop_trigger\"]/span")).getText();
        Thread.sleep(4000);
        String expectedTest = "Hi, ISRAT";
        if (actualText.equals(expectedTest)) {

            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        driver.close();
    }

    /**
     * Sephora's user should be able to successfully add the product in the shopping cart
     *
     * @throws InterruptedException
     */
    @Test
    public static void checkSephoraShoppingCartFunctionality() throws InterruptedException {
        //user in land in the Sephora homepage
        Thread.sleep(4000);
        // user is able to click on the MakeUp button in the homepage
        driver.findElement(By.xpath("//*[@id=\"top_nav_drop_2_trigger\"]")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"top_nav_drop_2_trigger\"]")).click();
        Thread.sleep(6000);
        //user is able to click on the "foundation" button in the makeup page
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div[3]/ul/li[1]/a")).click();
        Thread.sleep(5000);
        //user is able to select the "foundation"
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/main/div/div[2]/div[3]/a/span[2]")).click();
        Thread.sleep(4000);
        //user should be able to click on the "shopping cart" after selecting the foundation
        driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[1]/div[3]/div[3]/div/div/div[1]/button/span")).click();
        Thread.sleep(4000);
        //user should be able to sign in the "user name or password" box
        driver.findElement(By.xpath("//*[@id=\"signin_username\"]")).sendKeys("jisrat19@gmail.com");
        Thread.sleep(4000);
        //user should be able to enter the password in the "Password" box
        driver.findElement(By.xpath("//*[@id=\"signin_password\"]")).sendKeys("London31");
        Thread.sleep(4000);
        // user should be able to sign in the sign in the "sign in box"
        driver.findElement(By.xpath("//*[@id=\"modal4Dialog\"]/div/div/form/div[3]/button")).click();
        Thread.sleep(4000);

        String actualText = driver.findElement(By.xpath("//*[@id=\"top_nav_drop_3_trigger\"]")).getText();
        Thread.sleep(5000);
        String expectedTest = "Skincare";
        Thread.sleep(6000);
        if (actualText.equals(expectedTest)) {

            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }

    }


}









