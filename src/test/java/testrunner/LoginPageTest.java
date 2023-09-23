package testrunner;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ViewCartPage;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    ViewCartPage viewCartPage;
    LoginPage loginPage;

    public LoginPageTest() {
        super(); /* before initialize it called test base constructor */
    }
    @BeforeMethod
    public void setup() {
        initialization();
        homePage = new HomePage();
        viewCartPage = new ViewCartPage();
        loginPage = new LoginPage();
    }
    @Test(priority = 1)
    public void verifySignupNewUser() throws InterruptedException {
        homePage.clickOnaddToCart();
        homePage.clickOnViewCart();
        viewCartPage.clickOnProceedToCheckOut();
        viewCartPage.clickOnRegisterButton();
        loginPage.registerUser();
    }
}
