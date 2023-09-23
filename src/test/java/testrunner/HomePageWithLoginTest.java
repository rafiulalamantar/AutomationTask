package testrunner;

import base.TestBase;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

public class HomePageWithLoginTest extends TestBase {
    HomePage homePage;
    ViewCartPage viewCartPage;
    LoginPage loginPage;
    SignUpPage signUpPage;
    AccountCreatePage accountCreatePage;
    HomePageWithLogin homePageWithLogin;

    public HomePageWithLoginTest() {
        super(); /* before initialize it called test base constructor */
    }
    @BeforeMethod
    public void setup() {
        initialization();
        homePage = new HomePage();
        viewCartPage = new ViewCartPage();
        loginPage = new LoginPage();
        signUpPage = new SignUpPage();
        accountCreatePage = new AccountCreatePage();
        homePageWithLogin=new HomePageWithLogin();

    }
    public void verifyClickOnCartButton() throws InterruptedException, IOException, ParseException {
        homePage.clickOnaddToCart();
        homePage.clickOnViewCart();
        viewCartPage.clickOnProceedToCheckOut();
        viewCartPage.clickOnRegisterButton();
        loginPage.registerUser();
        signUpPage.signupForm();
        accountCreatePage.clickOnContinueButton();
        homePageWithLogin.clickOnCartButton();
    }
}
