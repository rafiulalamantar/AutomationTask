package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends TestBase {
    @FindBy(css = "textarea[name='message']")
    private WebElement commentText;
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    private WebElement placeOrder;

    public CheckOutPage(){
        PageFactory.initElements(driver, this);
    }

    public PaymentPage clickOnPlaceOrderButton(){
        commentText.sendKeys("ygdyfgydgfygdfy");
        placeOrder.click();
        return new PaymentPage();
    }

}
