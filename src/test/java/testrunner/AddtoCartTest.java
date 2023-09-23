package testrunner;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddtoCartPage;
import pages.HomePage;

import java.net.MalformedURLException;

public class AddtoCartTest extends TestBase {

    AddtoCartPage addtoCartPage;
    HomePage homePage;
    public AddtoCartTest(){
        super();
    }

    @BeforeMethod
    public void setup()  {
        try {
            initialization();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        addtoCartPage = new AddtoCartPage();
        homePage = new HomePage();

    }

    @Test
    public void verifyCheckout(){
        addtoCartPage.checkout();
    }
}
