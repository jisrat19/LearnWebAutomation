package allWebAutomation.amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeTest {
    //    public static void main(String[] args) throws InterruptedException {
//        //testAmazonSearchBox();
//        testAmazonSearchBox1();
//    }
    @Test

    public static void testAmazonSearchBox() throws InterruptedException {
        String driverPath = "../LearnWebAutomation/BrowserDriver/MAC/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
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

    public static void testAmazonSearchBox1() throws InterruptedException {

        String driverPath = "../LearnWebAutomation/BrowserDriver/MAC/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
        String actualText = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).getText();
        String expectedText = "Amazon Basics";
        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
        Thread.sleep(5000);
        driver.close();
    }


}