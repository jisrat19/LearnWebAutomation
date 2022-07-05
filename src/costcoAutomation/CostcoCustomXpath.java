package costcoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CostcoCustomXpath extends TestBase {

    /**
     * Costco's user should be able to successfully sort the samsung tv product
     *
     * @throws InterruptedException
     * @Author Israt
     */

    public static void samsungTvSortFunctionality() throws InterruptedException {
        Thread.sleep(4000);
        //driver.findElement(By.xpath("input[id='search-field']")).sendKeys("Tv");
        //driver.findElement(By.xpath("div.flex-child>button>i")).click();

        //user is able to land in Costco homepage successfully
        //user is able to search valid products name in the search box
        driver.findElement(By.xpath("//*[@id='search-field']")).sendKeys("Tv");
        Thread.sleep(4000);
        // user is able to click on the search icon
        driver.findElement(By.xpath("//*[@class='flex-child']/button/i")).click();
        Thread.sleep(4000);
        //user is able to locate to the Brand button under the Filter Result and click on it
        driver.findElement(By.xpath("//*[@id='facetForm']//descendant::div[@id='search-filter']/div[2]/fieldset[5]/div/legend/a")).click();
        // after the Brand expand user is able to see "Samsung" brand and click on in
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='accordion-filter_collapse-5']//descendant::div/span[2]/div/child::label/span[text()='Samsung']")).click();
        //user is able to go to the next page by clicking on the arrow for next page
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@class='paging col-xs-12']//descendant::ul/child::li[4]//descendant::a/i")).click();
        Thread.sleep(5000);
        //user is able to organize the page setup by clicking the 3linen on the right side of that page
        driver.findElement(By.xpath("//*[@automation-id='listViewLink']/i")).click();
        //user is able to sort the page by clicking on "sort by" box arrow
        driver.findElement(By.xpath("//*[@id='sort_by']")).click();
        //user is able to locate the option "Most viewed"
        driver.findElement(By.xpath("//*[@id='sort_by']/option[last()]")).getText();
        //user is able to locate the "Newest" option
        driver.findElement(By.xpath("//*[@id='sort_by']/option[last()-1]")).getText();
        //user is able to locate the "Rating (High to Low)" option
        driver.findElement(By.xpath("//*[@id='sort_by']/option[last()-2]")).getText();
        //user is able to locate the "Price (Low to High)" option
        driver.findElement(By.xpath("//*[@id='sort_by']/option[last()-3]")).getText();
        //user is able to locate the "Price(High to Low)" option
        driver.findElement(By.xpath("//*[@id='sort_by']/option[last()-4]")).getText();
        //verify user is able to locate the "Best Match" option at the
        String expectedText = "Best Match";
        //user is able to locate the "Best Match" option at the top of the sort option
        String actualText = driver.findElement(By.xpath("//*[@id='sort_by']/option[last()-5]")).getText();
        Assert.assertEquals(expectedText, actualText, "not match");

    }

    /**
     * Any new  Costco's user should be able to successfully create account by entering valid information
     *
     * @throws InterruptedException
     * @Author Israt
     */


    public static void registerFunctionality() throws InterruptedException {

        //user is able to click on the sign-in button on top of the Costco's homepage
        driver.findElement(By.xpath("//*[@id='header_sign_in']")).click();
        Thread.sleep(4000);
        //user is able to see "New to Costco?" text
        driver.findElement(By.xpath("//*[@id='newToCostco']")).getText();
        Thread.sleep(4000);
        //user is able to click on create account button
        driver.findElement(By.xpath("//*[@id='createAccount']")).click();
        Thread.sleep(4000);
        //user is able to see the text "Create Account" on top of the page
        driver.findElement(By.xpath("//*[@id='createAccountHeader']")).getText();
        Thread.sleep(4000);
        //user is able to enter email address in the "Email address" box
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("cinos57343@hekarro.com");
        Thread.sleep(4000);
        //user is able to enter password under the password box
        driver.findElement(By.xpath("//*[@id='newPassword']")).sendKeys("Coinss3456@");
        Thread.sleep(4000);
        //user needs to reenter the password in the "Confirm Password"
        driver.findElement(By.xpath("//*[@id='reenterPassword']")).sendKeys("Coinss3456@");
        Thread.sleep(4000);
        //user is able to click on "Yes" box to receive emails about special promotions and new product information from Costco
        driver.findElement(By.xpath("//*[@id='sendMeEmail_']")).click();
        Thread.sleep(10000);
        //user is able to click on "Create Account" button
        driver.findElement(By.xpath("//*[@id='continue']")).click();
        Thread.sleep(10000);
        //after sussesfully creating the account user is able to land on Membership plan gage
        driver.findElement(By.xpath("//*[@class='t1-style cds-u-space-mb-md']")).getText();
        Thread.sleep(4000);
        // user should have option for "Not a Costco Member"
        driver.findElement(By.xpath("//*[@class='t4-style margin-bottom-16']")).getText();
        Thread.sleep(4000);
        // user should also have the option for "Don't Want to Add Your Membership Number?"
        driver.findElement(By.xpath("Don't Want to Add Your Membership Number?")).getText();
        Thread.sleep(4000);
        // user is able to click on "Shop as Non-Member" button
        driver.findElement(By.xpath("//*[@id='shopAsNonMemberBtn']")).click();
        Thread.sleep(4000);
        //verify user is able to "Account" on top of the Costco Homepage
        String expectedText = "Account";
        String actualText = driver.findElement(By.xpath("//*[@id='myaccount-react-d']")).getText();
        Assert.assertEquals(expectedText, actualText, "Not Match");


    }

    /**
     * Costco's user should be able to successfully sign in Costco homepage by entering valid credential
     *
     * @throws InterruptedException
     * @Author Israt
     */

    public static void signInFunctionality() throws InterruptedException {

        //user is able to click on the sign-in button on top of the Costco's homepage
        driver.findElement(By.xpath("//*[@id='header_sign_in']")).click();
        // user is able to enter email address under the "Email Address" box
        driver.findElement(By.xpath("//*[@id='signInName']")).sendKeys("cinos57343@hekarro.com");
        //user is able to enter the password under the "Password" box
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Coinss3456@");
        //user is able to click on the Sign in button
        driver.findElement(By.xpath("//*[@id='next']")).click();
        //when user land in the "Add MemberShip" Page user can select "Shop-as-Non-Member"
        driver.findElement(By.xpath("//*[@id='shopAsNonMemberBtn']")).click();
        driver.findElement(By.xpath("//*[@id='myaccount-react-d']")).getText();
        // String expectedText = "Account";
        // String actualText = driver.findElement(By.xpath("//*[@id='myaccount-react-d']")).getText();
        // Assert.assertEquals(expectedText, actualText, "Not Match");

    }

    /**
     * Costco's user should be able to select the price range from the Bed Sheet products
     *
     * @throws InterruptedException
     * @Author Israt
     */


    public static void bedSheetPriceRange() throws InterruptedException {
        // user is able to click on the Shop menu bar on the left side of the Costco homepage
        driver.findElement(By.xpath("//*[@id='navigation-dropdown']")).click();
        //user is able to click on the "Home & Kitchen" link
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id='level1-all-departments']/ul/li[14]/a")).click();
        Thread.sleep(5000);
        //user is able to click on the "Bedding & Bath" under the Shop Bt Category
        driver.findElement(By.xpath("//*[@class='related_categories_list']/child::div[2]/div[3]/a/div/div/span[text()='Bedding & Bath']")).click();
        // user is able tpo click on "Bed Sheet" under the shop by category
        driver.findElement(By.xpath("//*[@class='category-box-content']//child::span[text()='Bed Sheets']")).click();
        // user is able to click on the price range
        driver.findElement(By.xpath("//*[@class='panel panel-default ']/child::div/legend/a[text()='Price']")).click();
        //user is able to click on the $25 to $50 range price
        driver.findElement(By.xpath("//*[@id='accordion-filter_collapse-4']/div/span[2]//descendant::div/child::label/span[1]")).click();
        // user is able to click on the "clear all" button
        driver.findElement(By.xpath("//*[@id='filter-header']/a[2]")).click();
        //verify user is able to see the "Bed Sheet" on top of the page
        String expectedText = "Bed Sheets ";
        String actualText = driver.findElement(By.xpath("//*[@id='category-name-header']/h1")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

    /**
     * Costco's user should be able to select the price range from the Bed Sheet products
     *
     * @throws InterruptedException
     * @Author Israt
     */


    public static void ordersAndReturnsFunctionality() throws InterruptedException {
        signInFunctionality();
        //user is able to click on the orders and returns button
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='header_order_and_returns']")).click();
        Thread.sleep(5000);
        // user is able to click on the "Account" button
        driver.findElement(By.xpath("//*[@id='mi_1']/a/span")).click();
        Thread.sleep(5000);
        //user is able to click on the "orders & purchase" button
        driver.findElement(By.xpath("//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-4']/child::div[1]/a/div/h2")).click();
        Thread.sleep(5000);
        // user is able to click on the show button to see the time frame of purchase record
        driver.findElement(By.xpath("//*[@id='my_order_date_select']")).click();
        Thread.sleep(5000);
        // verify user is able to select the month from 2022 January-June
        String expectedText = "2022 January - June";
        String actualText = driver.findElement(By.xpath("//*[@id='my_order_date_select']/option[2]")).getText();
        Assert.assertEquals(expectedText, actualText, "Not Match");

    }

    /**
     * Costco's user should be able to give feedback by using the customer Service Functionality
     *
     * @throws InterruptedException
     * @Author Israt
     */


    public static void customerServiceFunctionality() throws InterruptedException {
        //user is able to successful land in the Costco Homepage
        // user is able to click on the Customer service button on top[ of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='customer-service-link']")).click();
        //user is able to click on the contact button on the button of that page
        driver.findElement(By.xpath("//*[@id='desktopDropdownMenuButton']")).click();
        //user is able to click on the call us button
        driver.findElement(By.xpath("//*[@class='desktopContactUsDropDown']/div/div/div/a")).click();
        // user is able to click under the "Is this answer helpful" text a thumps up button
        driver.findElement(By.xpath("//*[@id='rn_CostcoAnswerFeedback_15_RatingYesButton']")).click();
        // verify user is able to see the text "Thanks for your feedback"
        String expectedText = "Thanks for your feedback.";
        String actualText = driver.findElement(By.xpath("//*[@id='rn_CostcoAnswerFeedback_15_ThanksLabel']")).getText();
        Assert.assertEquals(expectedText, actualText, "Not Match");

    }

    /**
     * Costco's user should be able to sort the Premium Cleansers based on skin type
     *
     * @throws InterruptedException
     * @Author Israt
     */


    public static void premiumCleansersSkinTypeSort() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement dropDownMouseHover = driver.findElement(By.xpath("//*[@id='navigation-dropdown']"));
        //user is able to click on the menu bar
        actions.moveToElement(dropDownMouseHover).perform();
        //user is able to click on the Beauty button
        driver.findElement(By.xpath("//*[@id='level1-all-departments']/child::ul/li[3]/a")).click();
        //actions.moveToElement(beautyMouseHover).perform();
        //user is able to click on the skin care button
        driver.findElement(By.xpath("//*[@class='col-xs-12 col-lg-6 col-xl-5ths']/child::a/div/div/span[text()='Skin Care']")).click();
        //user ois able to click on the Premium Cleansers under the Shop by Type category
        driver.findElement(By.xpath("//*[@class='col-xs-3 col-xl-12 category-tile']//following-sibling::h3[text()='Premium Cleansers']")).click();
        // user is able on the skin type section
        driver.findElement(By.xpath("//*[@id='accordion-filter_heading-8']/legend/a")).click();
        //user is able to select on the sensitive skin type
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='accordion-filter_collapse-8']/div/span[2]/div/label/span[text()='Sensitive']")).click();
        //verify user is able to see "Show Out of Stock Items Premium Cleansers" this text on top odf the page
        String expectedText = "Show Out of Stock Items Premium Cleansers";
        String actualText = driver.findElement(By.xpath("//*[@id='category-name-header']/child::h1")).getText();
        Assert.assertEquals(expectedText, actualText, "Not match");


    }

    /**
     * This method will verify all the resource in the Costco homepage under the About Us section
     *
     * @throws InterruptedException
     * @Author Israt
     */


    public static void footerSectionAboutUs() {
        //user should be able to locate all the "About Us" information in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li/a[text()='About Us']")).getText();
        //user is able to locate the "Costco Blog" button in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()-1]/a")).getText();
        //user is able to locate the "Quick and Easy Recipe Videos" button in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()-2]/a")).getText();
        //user is able to locate the "The Costco Connection" button in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()-3]/a")).getText();
        //user is able to locate the "Product Videos" button in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()-4]/a")).getText();
        //user is able to locate the "Logo and Media Requests" button in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()-5]/a")).getText();
        //user is able to locate the "Kirkland Signature" button in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()-6]/a")).getText();
        //user is able to locate the "Jobs" button in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()-7]/a")).getText();
        //user is able to locate the "Investor Relations" button in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()-8]/a")).getText();
        //user is able to locate the "Sustainability Commitment" button in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()-9]/a")).getText();
        //user is able to locate the "COVID Updates" button in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()-10]/a")).getText();
        //user is able to locate the "Company Information" button in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()-11]/a")).getText();
        //user is able to locate the "Charitable Contributions" button in the footer section of the Costco Homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()-12]/a")).getText();
        //verify user is able to locate the "Employee Site" button in the last section of the "About Us" section
        String expectedText = "Employee Site";
        String actualText = driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[1]//child::li[last()]/a")).getText();
        Assert.assertEquals(expectedText, actualText, "Not Match");
    }

    /**
     * This method will verify all the resource in the Costco homepage under the Customer Service section
     *
     * @throws InterruptedException
     * @Author Israt
     */


    public static void footerSectionACustomerService() {

        List<WebElement> webElementList = new ArrayList<>();
        //webElementList.add((WebElement) driver.findElements(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[3]/descendant::li/a")));
        webElementList = driver.findElements(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[2]/child::div//descendant::div[3]/descendant::li/a"));

        for (WebElement element : webElementList) {
            System.out.println(element);
        }
    }

    /**
     * This method will verify Custco user is able to visit the Costco Facebook Page from Costco Homepage
     *
     * @throws InterruptedException
     * @Author Israt
     */

    public static void socialMediaFacebook() throws InterruptedException {
        Thread.sleep(5000);
        //user is able to click the "No, Thanks" pop-up that comes on the homepage screen
        driver.findElement(By.xpath("//*[@id='closeEmailPopup']//following-sibling::div[1]//descendant::div/child::div[3]/a[text()='No Thanks']")).click();
        //user is able to click on the facebook image in footer section of the Costco homepage
        driver.findElement(By.xpath("//*[@id='opinionLabFooterLink']//ancestor::ul//ancestor::div[2]/child::div[1]//descendant::div[9]//descendant::img[@alt='Facebook']")).click();
        //user is able toi click on the "Visit External link"
        driver.findElement(By.xpath("//*[@id='costcoModalBtn2']")).click();
        //user is able to land on the facebook page
        //user is able to click on the ""about" button on top of the Costco facebook page
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@class='i09qtzwb rq0escxv n7fi1qx3 pmk7jnqg j9ispegn kr520xx4']//descendant::a[2]/child::div[1]/span")).click();
        Thread.sleep(4000);
        //various user is able to see "Welcome to the official Costco Facebook page! " this text under the "More Info" Section
        String expectedText = "Welcome to the official Costco Facebook page! ";
        String actualText = driver.findElement(By.xpath("//*[text()='Welcome to the official Costco Facebook page! ']")).getText();
        Assert.assertEquals(expectedText, actualText, "Not match");

    }

    /**
     * This method will verify Custco sports & Fitness Page functionality
     *
     * @throws InterruptedException
     * @Author Israt
     */

    public static void sportsFitnessPage() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement dropDownMouseHover = driver.findElement(By.xpath("//*[@id='navigation-dropdown']"));
        //user is able to click on the menu bar
        actions.moveToElement(dropDownMouseHover).perform();
        //user is able to click on the sports & Fitness button
        driver.findElement(By.xpath("//*[@id='level1-all-departments']/child::ul/li[20]/a")).click();
        Thread.sleep(5000);
        //user is able to click on the Camping button under the Shop by Category section
        driver.findElement(By.xpath("//*[@class='categoryclist_v2']//descendant::div[@class='row'][2]/child::div[1]//descendant::span")).click();
        //user is able to click on the Outdoor Chairs button under the Shop by Category section
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class='search-results-tile search-results-tile-v2 ']//descendant::div[@class='row'][2]/child::div[1]//descendant::span[1][text()='Outdoor Chairs']")).click();
        //verify user is able to see this text "Outdoor Chairs "
        String expectedText = "Outdoor Chairs";
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath("//*[@class='search-results-tile search-results-tile-v2 ']//preceding-sibling::div//descendant::div[3]/div/div[@id='category-name-header']/h1")).getText();
        Thread.sleep(5000);
        Assert.assertEquals(expectedText, actualText, "Not match");


    }


}
