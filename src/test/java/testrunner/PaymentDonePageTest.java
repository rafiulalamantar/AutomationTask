package testrunner;

import base.TestBase;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

public class PaymentDonePageTest extends TestBase {
    HomePage homePage;
    ViewCartPage viewCartPage;
    LoginPage loginPage;
    SignUpPage signUpPage;
    AccountCreatePage accountCreatePage;
    HomePageWithLogin homePageWithLogin;
    ViewCartPageWithLogin viewCartPageWithLogin;
    CheckOutPage checkOutPage;
    PaymentPage paymentPage;
    PaymentDonePage paymentDonePage;

    public PaymentDonePageTest() {
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
        viewCartPageWithLogin = new ViewCartPageWithLogin();
        checkOutPage = new CheckOutPage();
        paymentPage = new PaymentPage();
        paymentDonePage = new PaymentDonePage();

    }
    @Test(priority = 1)
    public void verifyThankYouMessage() throws InterruptedException, IOException, ParseException {
        homePage.clickOnaddToCart();
        homePage.clickOnViewCart();
        viewCartPage.clickOnProceedToCheckOut();
        viewCartPage.clickOnRegisterButton();
        loginPage.registerUser();
        signUpPage.signupForm();
        accountCreatePage.clickOnContinueButton();
        Thread.sleep(5000);
        homePageWithLogin.clickOnCartButton();
        viewCartPageWithLogin.clickOnProceedToCheckout();
        checkOutPage.clickOnPlaceOrderButton();
        paymentPage.clickOnPaymentButton();
        String alterSuccessText=paymentDonePage.checkThankYouMessage();
        Assert.assertEquals(alterSuccessText, "Congratulations! Your order has been confirmed!",
                "Verify success message 'Congratulations! Your order has been confirmed!'");

    }
}
