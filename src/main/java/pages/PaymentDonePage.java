package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDonePage extends TestBase {
    @FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    private WebElement thankyouMessage;

    public PaymentDonePage(){
        PageFactory.initElements(driver, this);
    }

    public String checkThankYouMessage(){
        return thankyouMessage.getText();
    }

}
