package costcoAutomation;

import org.testng.annotations.Test;

import static costcoAutomation.CostcoCustomXpath.*;


public class TextCostcoProducts extends TestBase{


    @Test
    public void testSamsungTvSortFunctionality()  throws InterruptedException {
        samsungTvSortFunctionality();
    }

    @Test
    public void testRegisterFunctionality() throws InterruptedException {
        registerFunctionality();
    }
    @Test
    public void testSignInFunctionality() throws InterruptedException {
        signInFunctionality();
    }
    @Test
    public void testBedSheetPriceRange() throws InterruptedException {
        bedSheetPriceRange();
    }
    @Test
    public void testOrdersAndReturns() throws InterruptedException {
        ordersAndReturnsFunctionality();
    }
    @Test
    public void testCustomerService() throws InterruptedException {
        customerServiceFunctionality();
    }
    @Test
    public void testPremiumCleansersSkinTypeSort() throws InterruptedException {
        premiumCleansersSkinTypeSort();
    }
    @Test
    public void testFooterSectionAboutUs() throws InterruptedException {
        footerSectionAboutUs();
    }
    @Test
    public void testFooterSectionACustomerService() throws InterruptedException {
        footerSectionACustomerService();
    }
    @Test
    public void testSocialMediaFacebook() throws InterruptedException {
        socialMediaFacebook();
    }
    @Test
    public void testSportsFitnessPage() throws InterruptedException {
        sportsFitnessPage();
    }
}
