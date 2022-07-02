package testAutomationPractice;

import base.TestBase;
import org.testng.annotations.Test;


import static ebayPracticeAutomation.EbayCustomXPath.*;

public class TestEbayWebsite extends TestBase {

    @Test
    public void testSearchBoxFunctionality() throws InterruptedException {

        searchBoxFunctionality();

    }
    @Test
    public void testShoppingCartFunctionality() throws InterruptedException {
        shoppingCartFunctionality();
    }
    @Test
    public void testEbayFooterSection() throws InterruptedException {
        registerFunctionalityInFooterSection();
    }
    @Test
    public void testSocialMediaFunctionality() throws InterruptedException {
        socialMediaFunctionality();
    }

    @Test
    public void testSavedFunctionality(){
        savedFunctionality();
    }

    @Test
    public void testIssueFunctionalityInEbayMainStreet() throws InterruptedException {
        //my method is keep failing but if I run up to government relation code it pass. still do not load to next page
        issueFunctionalityInEbayMainStreetPage();
    }
    @Test
    public void testRegisterFunctionality() throws InterruptedException {
        // this method is not taking my custom-made Xpath for "Register" button
        registerFunctionality();
    }
    @Test
    public void testMountainBikesProduct() throws InterruptedException {

        mountainCycleProduct();
    }
    @Test
    public void testAdvancedFunctionality() throws InterruptedException {

        advancedFunctionality();
    }
    @Test
    public void testImpressionismPaintingsProduct() throws InterruptedException {

        impressionismPaintingsProduct();
    }

}
