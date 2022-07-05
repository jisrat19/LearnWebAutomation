package ebayPracticeAutomation;

import org.testng.annotations.Test;

import static ebayPracticeAutomation.EbayCustomXPath.*;

public class TestEbayProducts extends TestBase {

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
    @Test
    public void testEbayFooterText() throws InterruptedException {

        ebayFooterSectionText();
    }
    @Test
    public void testDailyDealsFunctionality() throws InterruptedException {
        dailyDealsFunctionality();
    }
    @Test
    public void testDatsunCarsAndTrucks() throws InterruptedException {
        datsunCarsAndTrucks();
    }

    @Test
    public void testSignOutFunctionality() throws InterruptedException {
        signOutFunctionality();
    }



}
