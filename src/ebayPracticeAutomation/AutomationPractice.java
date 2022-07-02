package ebayPracticeAutomation;

import base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AutomationPractice extends TestBase {
    /**
     * automation practice user should be able to successfully search in the search box functionality with valid product
     *
     * @throws InterruptedException
     */


    public static void SearchBoxFunctionality() throws InterruptedException {
        //user should be able to successfully land in the AutomationPractice homepage
        //user is able to click on the search box
        //user is able to write in the search box
        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Printed Chiffon Dress");
        //user is able to click on the search button
        driver.findElement(By.xpath("//*[@name='submit_search']")).click();
        //user is able to click on the product name
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).click();
        String expectedText="Condition";
        String actualText=driver.findElement(By.xpath("//*[contains(text(),'Condition ')]")).getText();
        Assert.assertEquals(expectedText,actualText,"Not match");



    }










}
