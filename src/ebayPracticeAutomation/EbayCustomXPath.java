package ebayPracticeAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class EbayCustomXPath extends TestBase {


    /**
     * A Ebay user should be able to successfully search in the search box functionality with valid product
     * in this method all the Xpath is custom-made
     *
     * @throws InterruptedException
     * @Author Israt
     * //tagName[@AttributeName='AttributeValue']
     * //*[text()='value']
     */

    public static void searchBoxFunctionality() throws InterruptedException {
        //Ebay user is successfully land in the Ebay homepage
        //User is able to type on the search bar
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iphone 13");
        // user is able to click on the search button
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        // verify user is able to see the valid v]product "iphone 13"
        String expectedText = "iphone 13";
        String actualText = driver.findElement(By.xpath("//*[text()='iphone 13']")).getText();
        Assert.assertEquals(actualText, expectedText, "Not match");
    }

    /**
     * This test method will verify successfully adding products in the Ebay shopping cart
     * in this method all the Xpath is custom-made
     * //tagName[@AttributeName='AttributeValue']
     * //*[text()='value']
     *
     * @throws InterruptedException
     */


    public static void shoppingCartFunctionality() throws InterruptedException {
        //Ebay user is successfully land in the Ebay homepage
        //User is able to type on the search bar
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mask");
        // user is able to click on the search button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        Thread.sleep(3000);
        // user is able to locate the product and select the item
        driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[10]/div/div[2]/a/h3")).click();
        driver.findElement(By.xpath("//*[@id=\"atcRedesignId_btn\"]")).click();
        Thread.sleep(3000);

        // user is able to add product in the ebay shopping cart
        //driver.findElement(By.xpath("//*[@id='isCartBtn_btn']")).getText();
        //user is able to add product fow watchlist
        //driver.findElement(By.xpath("//*[@id='vi-atl-lnk']")).click();

//        driver.findElement(By.xpath("//*[text()='No thanks']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("cart-remove-item")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[3]/div[1]/div/div[1]/span/span/span")).getText();
    }

    /**
     * A Ebay user should be able to use Register functionality from the footer section and successfully navigate to the "Account" page
     * in this method all the Xpath is custom-made
     *
     * @throws InterruptedException
     * @Author Israt
     */


    public static void registerFunctionalityInFooterSection() throws InterruptedException {
        Thread.sleep(4000);
        //User is able to land on the Ebay Homepage
        //user is able to locate the ebay footer section
        // user is able to click on the register button in the footer section
        driver.findElement(By.xpath("//*[text()='Buy']//following::ul[1]/li[1]")).click();
        Thread.sleep(4000);
        // user is able to navigate to the next page where user will find "Related help topics See other articles in: Account"
        //in  this page user is able to click on the Account button
        driver.findElement(By.xpath("//*[text()='Managing your account']//following::ul[1]/li[1]")).click();
        Thread.sleep(4000);
        //user should land in the following page "Account" and user should be able to locate the text"Your Account Status"
        String expectedText = "Your Account Status";
        // verify user ius able to see the text "Your Account Status" in the Account Page
        String actualText = driver.findElement(By.xpath("//*[@id=\"account-account-status\"]/h2")).getText();
        Assert.assertEquals(expectedText, actualText, "Not match");


    }


    /**
     * This test method will verify successfully adding products in the Ebay shopping cart
     * //*[contains(text(),'PUMA Women's Prowl Slip On Training Shoes')] this one did not word
     * div[starts-with(@class,'s-item__info clearfix') and text()='PUMA Women's Prowl Slip On Training Shoes']
     *
     * @throws InterruptedException
     */

    public static void socialMediaFunctionality() throws InterruptedException {
        //user should be able to successfully land in the Ebay homepage
        //User is able to locate in the footer section of the ebay Home page
        // user is able to use the faceBook function
        driver.findElement(By.xpath("//*[text()=' Stay connected']//following::ul[1]/li[1]")).click();
        // verify user is able to land in the ebay FaceBook page
        String expectedText = "Shopping & retail";
        String actualText = driver.findElement(By.xpath("//*[text()='Shopping & retail']")).getText();
        Assert.assertEquals(expectedText, actualText, "Not match");

    }

    /**
     * This test method will verify successfully use the Saved function
     * // below this is followingMethod
     * //*[@class='hl-cat-nav__container']//following::li[1]/a[@href="https://www.ebay.com/feed"]
     * //*[@id='signin-continue-btn']"
     * "//*[text()='israt']"
     *
     * @throws InterruptedException
     * @Author Israt
     */


    public static void savedFunctionality() {
        //user should be able to successfully land in the Ebay homepage
        // user is able to click on the saved function on the top of the ebay homepage
        driver.findElement(By.xpath("//*[@class='hl-cat-nav__container']//following::li[1]/a[@href=\"https://www.ebay.com/feed\"]")).click();
        //user is able to land is a sign-in page
        // user is able to type valid email-address
        driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("jisrat19@gmail.com");
        // user is able to click inn the continue button
        driver.findElement(By.xpath("//*[@id='signin-continue-btn']")).click();
        // user is able to land in password entering page
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("London31");
        // user is able to click in sign in button
        driver.findElement(By.xpath("//*[@id='sgnBt']")).click();
        //verify user is able to see the "israt" text on top of the Ebay home page
        String expectedResult = "israt";
        String actualResult = driver.findElement(By.xpath("//*[text()='israt']")).getText();
        Assert.assertEquals(expectedResult, actualResult, "Not match");

    }

    /**
     * This test method will verify successfully use the issue function in the ebay Main Street page
     * // below this is siblingMethod
     * //*[@class='gf-bttl']//following-sibling::h3/a//preceding::li[8]"]
     * <p>
     * "//*[text()='israt']"
     *
     * @throws InterruptedException
     * @Author Israt
     */

    public static void issueFunctionalityInEbayMainStreetPage() throws InterruptedException {
        //user should be able to successfully land in the Ebay homepage
        // user is able to navigate to the Community page by click on the "Community" link on the footer section on the ebay homepage
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class='gf-bttl']//following-sibling::h3/a")).click();
        Thread.sleep(5000);
        //when user successfully land in the "Community" page then the user is able to click on the "Government Relation" link on the bottom of that page
        driver.findElement(By.xpath("//*[@class='gf-bttl']//following-sibling::h3/a//preceding::li[8]")).click();
        Thread.sleep(5000);
        // user is able to move forward by clicking in the "issue" button on top of the hedder section
        driver.findElement(By.xpath("//*[@class='region region-subheader']//following::div[1]/nav/ul/li[2]")).click();
        //verify user is able landed in ebay Main Street page by locating "Featured Issues" this text
        String expectedTest = "Featured Issues";
        String actualTest = driver.findElement(By.xpath("//*[contains(text(),'Featured Issues')]")).getText();
        Assert.assertEquals(expectedTest, actualTest, "not match");

    }

    /**
     * This test method will verify user is able to successfully create an ebay account with valid credential
     * i only copied register button xpath from the website
     *
     * @throws InterruptedException
     * @Author Israt
     */

    public static void registerFunctionality() throws InterruptedException {
        //user should be able to successfully land in the Ebay homepage
        //user as able to click in the "Register"button on the top of the ebay page
        // driver.findElement(By.xpath("//*[@_sp='m570.l2621']")).click();
        driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
        Thread.sleep(4000);
        //user should be navigated to "Create Account" page where user must needs to fill out all boxes
        //user should be able to click and type on the "First Name" box
        driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("John");
        //user should be able to click and type on the "Last Name" box
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Washington");
        //user should be able to click and type on the "Email" box
        driver.findElement(By.xpath("//*[@name='Email']")).sendKeys("colorad349@hekarro.com");
        //user should be able to click and type on the "Password" box
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("JohnWash1234");
        //user should be able to click on the "Create Account" box
        driver.findElement(By.xpath("//*[@id='EMAIL_REG_FORM_SUBMIT']")).click();
        //verify user is able to see the "israt" text on top of the Ebay home page
        String expectedResult = "John";
        String actualResult = driver.findElement(By.xpath("//*[text()='Jonn']")).getText();
        Assert.assertEquals(expectedResult, actualResult, "Not match");
    }

    /**
     * This test method will verify user is able to successfully locate to the MountainBikesProductPage
     *
     * @throws InterruptedException
     * @Author Israt
     */

    public static void mountainCycleProduct() throws InterruptedException {
        //user should be able to successfully land in the Ebay homepage
        //User is able to click "Sporting Goods" and navigate to the "Sporting Goods & Equipment" oage
        driver.findElement(By.xpath("//*[@class='hl-cat-nav__container']//following::li[9]/a[@href=\"https://www.ebay.com/b/Sporting-Goods/888/bn_1865031\"]")).click();
        Thread.sleep(4000);
        // user is able to click on "Cycle" product that is located in the "Sporting Goods & Equipment" section
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/child::section[1]/child::div[2]/child::a[2]/child::div[2]")).click();
        // user is able to click on "Mountain Bikes" product that is located in the "Shop by Bike Type" section
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@class='b-carousel__header ']/following-sibling::div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/p")).click();
        // verify user is able to see theis text "Mountain Bikes"
        String expectedText = "Mountain Bikes";
        String actualText = driver.findElement(By.xpath("//*[@class='b-pageheader__text']")).getText();
        Assert.assertEquals(expectedText, actualText, "Not match");
    }

    /**
     * This test method will verify user is able to successfully use the Ebay Advanced functionality
     *
     * @throws InterruptedException
     * @Author Israt
     */
    public static void advancedFunctionality() throws InterruptedException {
        //user should be able to successfully land in the Ebay homepage
        //user is able to locate and click on the "advanced" button on the top of the ebay homepage
        driver.findElement(By.xpath("//*[@id='gh-as-a']")).click();
        Thread.sleep(4000);
        //user is able to successfully land in the "Advanced Search" page
        //user is able to click on where its says, "Enter keywords or item number" and type the number item
        driver.findElement(By.xpath("//*[@id='_nkw']")).sendKeys("2");
        //user is able to click on where its says, "Exclude words from your search" and type the words of your item
        driver.findElement(By.xpath("//*[@id='_ex_kw']")).sendKeys("toys");
        // user is able to click on the search button
        driver.findElement(By.xpath("//*[@id='_ex_kw']//following::div[2]/button")).click();
        //verify user is able to successfully land in the toy page by checking "Categories" word on that page
        String expectedText = "Categories";
        String actualText = driver.findElement(By.xpath("//*[text()='Categories']")).getText();
        Assert.assertEquals(expectedText, actualText, "not match");
    }

    ////*[@class='gh-hide-if-nocss']/child::li[3]

    /**
     * This test method will verify user is able to successfully get into the "Impressionism Paintings" page
     *
     * @throws InterruptedException
     * @Author Israt
     */

    public static void impressionismPaintingsProduct() throws InterruptedException {

        //user should be able to successfully land in the Ebay homepage
        //user should have access all the menu bar on the homepage
        List<WebElement> elementList = new ArrayList<>();
        elementList = driver.findElements(By.xpath("//*[@id='follow-ebay-helper']//preceding-sibling::div/ul"));
        //elementList.add((WebElement) driver.findElements(By.xpath("//*[@id='follow-ebay-helper']//preceding-sibling::div/ul")));

        for (WebElement web : elementList) {
            System.out.println(web);
            if (web.equals("Saved")) {
                System.out.println("Hello");
            }
        }
        Thread.sleep(4000);
        // user is able to click on the "Collectibles & Art" and load on the following page
        driver.findElement(By.xpath("//*[@id='follow-ebay-helper']//preceding-sibling::div/ul/li[5]/a")).click();
        Thread.sleep(4000);
        //user is able to click on the "Art" link under the "Shop by Category" text
        // after clicking the button user is able to view more product choice
        driver.findElement(By.xpath("//*[@id='s0-17-12-0-1[0]-0-0-27[1]-0']")).click();
        // user is able to click on the "Art painting" under the "Art" section
        driver.findElement(By.xpath("//*[@id='s0-17-12-0-1[0]-0-0-27[1]-0']/child::ul/li[4]")).click();
        //after loading the page from "Art" page user should be able to see "Shop More Paintings" text
        driver.findElement(By.xpath("//*[@id='s0-28_1-9-0-1[1]-0-2-0-title']")).getText();
        //under the "Shop More Paintings" section user should be able to click on the "Impressionism" text link
        driver.findElement(By.xpath("//*[@class='b-visualnav__grid']/child::a[1]/child::div[2]")).click();

        //driver.findElement(By.xpath("//li[3]//a[1]//h2[1]")).click();
        // verify user is able to view this text"Impressionism Paintings"
        String expectedText = "Impressionism Paintings";
        String actualText = driver.findElement(By.xpath("//*[@class='b-pageheader__text']")).getText();
        Assert.assertEquals(expectedText, actualText, "Not Match");

    }

    /**
     * This test method will verify user is able to all the information links in the footer section
     *
     * @throws InterruptedException
     * @Author Israt
     */

    public static void ebayFooterSectionText() throws InterruptedException {
        //user should be able to successfully land in the Ebay homepage
        // user is able to locate in the footer section of the ebay page
        //user is able to see the text "security Center"
        driver.findElement(By.xpath("//*[@style='display: ;']//following-sibling::td[1]/ul[2]/li[2]/a[@href='https://pages.ebay.com/securitycenter/index.html']")).getText();
        //user is able to see the text "Ebay Money-Back Guarantee"
        driver.findElement(By.xpath("//*[text()='Advertise with us']//ancestor::ul//ancestor::td//preceding::td[3]/ul/li[2]")).getText();
        //user is able to see the text "About Ebay" Text
        driver.findElement(By.xpath("//*[text()='Advertise with us']//ancestor::ul//ancestor::td//descendant::h3")).getText();
        //user is able to see the text "Tools & apps"
        driver.findElement(By.xpath("//*[text()='Advertise with us']//ancestor::ul//ancestor::td//preceding::td[2]/h3[2]")).getText();
        //user is able to see the text "Sell"
        driver.findElement(By.xpath("//*[text()='Site map']//ancestor::ul//ancestor::td/h3[1]/a")).getText();
        //user is able to see the text "Buy"
        driver.findElement(By.xpath("//*[text()='Site map']//ancestor::ul//ancestor::td//preceding::td[1]/h3/a")).getText();
        // verify user is able to the last text " eBay Sites" in the ebay footer section
        String expectedText = "eBay Sites";
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath("//*[text()='Site map']//ancestor::ul//ancestor::td//following-sibling::td[3]/child::h3[3]")).getText();
        Assert.assertEquals(expectedText, actualText, "Not match");


    }

    /**
     * This test method will verify the "Other Deals" page different department sections in the eEbay website
     *
     * @throws InterruptedException
     * @Author Israt
     */


    public static void dailyDealsFunctionality() throws InterruptedException {
        Thread.sleep(4000);
        //user should be able to successfully land in the Ebay homepage
        // user is able to click on the ""Daily Deals" button on top of the ebay Homepage
        driver.findElement(By.xpath("//*[@class='hl-cat-nav__js-tab']//ancestor::ul//ancestor::div//ancestor::body/child::header/child::div[1]/child::ul/child::li[2]/a")).click();
        Thread.sleep(4000);
        //user is able to click on ""Other Deals" button
        driver.findElement(By.xpath("//*[@class='selected navigation-desktop-with-flyout']//following::li[6]")).click();
        // when the page load verify following "section" in text is showing
        //user is able to see the "Deals" section
        driver.findElement(By.xpath("//*[@class='navigation-desktop']/child::h1")).getText();
        //user is able to see the "Toys" section
        driver.findElement(By.xpath("//*[@class='navigation-desktop']//following-sibling::div[@class='sections-container']/child::div[2]//descendant::h2/span")).getText();
        //user is able to see the "Coins" section
        driver.findElement(By.xpath("//*[@class='navigation-desktop']//following-sibling::div[@class='sections-container']/child::div[3]//descendant::h2/span")).getText();
        //user is able to see the "collectibles" section
        driver.findElement(By.xpath("//*[@class='navigation-desktop']//following-sibling::div[@class='sections-container']/child::div[4]//descendant::h2/span")).getText();
        //user is able to see the "Music and Gear" section
        driver.findElement(By.xpath("//*[@class='navigation-desktop']//following-sibling::div[@class='sections-container']/child::div[5]//descendant::h2/span")).getText();
        //user is able to see the "Luggage & Travel" section
        driver.findElement(By.xpath("//*[@class='navigation-desktop']//following-sibling::div[@class='sections-container']/child::div[6]//descendant::h2/span")).getText();
        //user is able to see the "Sports Fun shop" section
        driver.findElement(By.xpath("//*[@class='navigation-desktop']//following-sibling::div[@class='sections-container']/child::div[7]//descendant::h2/span")).getText();
        //user is able to see the "Office Furniture & Supplies" section
        driver.findElement(By.xpath("//*[@class='navigation-desktop']//following-sibling::div[@class='sections-container']/child::div[8]//descendant::h2/span")).getText();
        //user is able to see the "Light Equipment & Tools" section
        driver.findElement(By.xpath("//*[@class='navigation-desktop']//following-sibling::div[@class='sections-container']/child::div[9]//descendant::h2/span")).getText();
        //user is able to see the "Restaurant & Catering" section
        driver.findElement(By.xpath("//*[@class='navigation-desktop']//following-sibling::div[@class='sections-container']/child::div[10]//descendant::h2/span")).getText();
        //user is able to see the "Business & Industrial" section
        driver.findElement(By.xpath("//*[@class='navigation-desktop']//following-sibling::div[@class='sections-container']/child::div[11]//descendant::h2/span")).getText();
        //user is able to see the "Cleaning & Janitorial Supplies" section
        driver.findElement(By.xpath("//*[@class='navigation-desktop']//following-sibling::div[@class='sections-container']/child::div[12]//descendant::h2/span")).getText();
        // verify the last text section should be "Collectible Knives and Swords" in the "other deals" page
        String expectedText = "Collectible Knives and Swords";
        String actualText = driver.findElement(By.xpath("//*[@class='navigation-desktop']//following-sibling::div[@class='sections-container']/child::div[13]//descendant::h2/span")).getText();
        Assert.assertEquals(expectedText, actualText, "Not Match");
        Thread.sleep(5000);
    }

    /**
     * This test method will verify the "Datsun Cars & Trucks" page setup
     *
     * @throws InterruptedException
     * @Author Israt
     */

    public static void datsunCarsAndTrucks() throws InterruptedException {
        Thread.sleep(4000);
        //user is able to click on the Motor button on top of the ebay homepage
        driver.findElement(By.xpath("//*[@id='mainContent']//descendant::div/ul/li[3]/a[text()='Motors']")).click();
        //user is able to click on the "Vehicle" button
        driver.findElement(By.xpath("//*[@class='b-list__header']//following-sibling::ul/li[1]/button/span")).click();
        // user is able to click on the "classic Car" button
        driver.findElement(By.xpath("//*[@class='b-accordion-subtree']/li[2]/a[text()='Classic Cars']")).click();
        //user is able to click on the "AMC" button under the "Shop by Make" Section
        driver.findElement(By.xpath("//*[@class='section-title__title']//ancestor::section/ul/li/a[text()='AMC']")).click();
        //user is able to click on the "BMW" button under the "AMC Cars and Trucks" Section
        driver.findElement(By.xpath("//*[@class='section-title__title']//ancestor::section/ul/li/a[text()='BMW']")).click();
        //user is able to click on the "Datsun" button under the "BMW Cars and Trucks" Section
        driver.findElement(By.xpath("//*[@class='section-title__title']//ancestor::section/ul/li/a[text()='Datsun']")).click();
        // after loading in the "Datsun Cars & Trucks" user is able to click on the "Coupe" button under the "Shop by Body Type" section
        driver.findElement(By.xpath("//*[@class='carousel__viewport']//descendant::ul/li[2]/a")).click();
        //in the Datsun page user is able to ckick on the right side of the box to organize the page view
        driver.findElement(By.xpath("//*[@class='srp-controls__flyouts srp-controls__row-cells right clearfix']/child::div[2]/span/button")).click();
        // user is able to click on the "List view" link to see the cgange of a new page set up
        driver.findElement(By.xpath("//*[@class='srp-controls__flyouts srp-controls__row-cells right clearfix']/child::div[2]/span/span/ul/li/a")).click();
        // user is able to click back in the menu box view section again
        driver.findElement(By.xpath("//*[@class='srp-controls__flyouts srp-controls__row-cells right clearfix']/child::div[2]/span/button")).click();
        String expectedText = "Gallery View";
        //verify user is able to see the page setup option to go back to "Gallery View" againg
        String actualText = driver.findElement(By.xpath("//*[@class='srp-controls__flyouts srp-controls__row-cells right clearfix']/child::div[2]/span/span/ul/li/a/span[text()='Gallery View']")).getText();
        Assert.assertEquals(expectedText, actualText, "Not Match");
        Thread.sleep(5000);

    }

    /**
     * This test method will verify the ebay user is successfully sign-out
     *
     * @throws InterruptedException
     * @Author Israt
     */

    public static void signOutFunctionality() throws InterruptedException {
        //user ia able to click on the sign-in button
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class='gh-t ']/span/a[text()='Sign in']")).click();
        Thread.sleep(5000);
        //user is able to successfully land on the sign-in page
        // user is able to enter username of gmail in the first box where its says "Email or username"
        driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("jisrat19@gmail.com");
        //user is able to click on the continue button
        driver.findElement(By.xpath("//*[@id='signin-continue-btn']")).click();
        //user ius able to click on the password box under the "Wellcome Box" and enter the valid password
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("London31");
        //user is able to click on the sign in button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='sgnBt']")).click();
        Thread.sleep(3000);
        //user is able to click on the "Hi israt" on top of the ebay homepage
        driver.findElement(By.xpath("//*[@id='gh-ug']")).click();
        Thread.sleep(4000);
        // user is able to click on the sign out button
        driver.findElement(By.xpath("//*[@id='gh-uu']/li[5]/a[text()='Sign out']")).click();
        // verify user is able to see this sign in option "" in the ebay home page after succesfully logged off
        String expectedText = "Sign in";
        String actualText = driver.findElement(By.xpath("//*[@class='gh-t ']/span/a[text()='Sign in']")).getText();
        Assert.assertEquals(expectedText, actualText, "Not Match");
        Thread.sleep(5000);

    }


    }

