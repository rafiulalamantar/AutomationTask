package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPageWithLogin extends TestBase {

    @FindBy(css = ".btn.btn-default.check_out")
    private WebElement proceedToCheckOut;

    public ViewCartPageWithLogin(){
        PageFactory.initElements(driver, this);
    }

    public CheckOutPage clickOnProceedToCheckout(){
        proceedToCheckOut.click();
        return new CheckOutPage();
    }

}
