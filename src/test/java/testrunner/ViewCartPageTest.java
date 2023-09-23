package testrunner;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ViewCartPage;

public class ViewCartPageTest extends TestBase {
    HomePage homePage;
    ViewCartPage viewCartPage;

    public ViewCartPageTest() {
        super(); /* before initialize it called test base constructor */
    }

    @BeforeMethod
    public void setup() {
        initialization();
        homePage = new HomePage();
        viewCartPage = new ViewCartPage();
    }
    @Test(priority = 1)
    public void verifyProceedToCheckOut(){
        homePage.clickOnaddToCart();
        homePage.clickOnViewCart();
        viewCartPage.clickOnProceedToCheckOut();
    }
    @Test(priority = 2)
    public void verifyClickOnRegisterButton(){
        verifyProceedToCheckOut();
        viewCartPage.clickOnRegisterButton();

    }
}
