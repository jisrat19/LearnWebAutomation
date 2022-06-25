package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomoPage {

//String filePath="../LearnWebAutomation/BrowserDriver/MAC/chromedriver";

    public static void main(String[] args) throws InterruptedException {

        // Driver location
        String driverPath = "../LearnWebAutomation/BrowserDriver/MAC/chromedriver";

        System.setProperty("webdriver.chrome.driver", driverPath);
        // open browser
        WebDriver driver = new ChromeDriver();
        //  navigate to amazon.com
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


        //   enter keyword in searchBox field
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

//        String actualProductName=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
//        String expectedProductName="Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
//        if (actualProductName.equals(expectedProductName)) {
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test Fail");
//        }


        String actualProductName=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).getText();
        String expectedProductName="Amazon Basics";
        if (actualProductName.equals(expectedProductName)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }






        Thread.sleep(10000);
        driver.close();





    }

}
