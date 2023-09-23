package testrunner;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends TestBase {

    HomePage homePage;

    public HomePageTest() {
        super(); /* before initialize it called test base constructor */
    }

    @BeforeMethod
    public void setup() {
        initialization();
        homePage = new HomePage();
    }
    @Test(priority = 6)
    public void verifyClickOnAddToCart() throws InterruptedException {
        homePage.clickOnaddToCart();
        homePage.clickOnViewCart();
    }
}
