package testrunner;

import base.TestBase;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
import pages.ViewCartPage;

import java.io.IOException;

public class SignUpPageTest extends TestBase {
    HomePage homePage;
    ViewCartPage viewCartPage;
    LoginPage loginPage;
    SignUpPage signUpPage;

    public SignUpPageTest() {
        super(); /* before initialize it called test base constructor */
    }
    @BeforeMethod
    public void setup() {
        initialization();
        homePage = new HomePage();
        viewCartPage = new ViewCartPage();
        loginPage = new LoginPage();
        signUpPage = new SignUpPage();
    }
    @Test(priority = 1)
    public void verifySignupPage() throws InterruptedException, IOException, ParseException {
        homePage.clickOnaddToCart();
        homePage.clickOnViewCart();
        viewCartPage.clickOnProceedToCheckOut();
        viewCartPage.clickOnRegisterButton();
        loginPage.registerUser();
        signUpPage.signupForm();
    }
}
