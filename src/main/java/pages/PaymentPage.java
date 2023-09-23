package pages;

import base.TestBase;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.JSONReader;

import java.io.IOException;

public class PaymentPage extends TestBase {
    @FindBy(css = "input[name='name_on_card']")
    private WebElement cardName;
    @FindBy(css = "input[name='card_number']")
    private WebElement cardNumber;
    @FindBy(css = "input[placeholder='ex. 311']")
    private WebElement cardCVV;
    @FindBy(css = "input[placeholder='MM']")
    private WebElement expireMonth;
    @FindBy(css = "input[placeholder='YYYY']")
    private WebElement expireYear;
    @FindBy(css = "//button[@id='submit']")
    private  WebElement confirmOrder;
    public PaymentPage(){
        PageFactory.initElements(driver, this);
    }

    public PaymentDonePage clickOnPaymentButton() throws InterruptedException, IOException, ParseException {
        cardNumber.sendKeys(JSONReader.paymentDetails("cardNumber"));
        cardName.sendKeys(JSONReader.paymentDetails("nameOnCard"));
        cardCVV.sendKeys(JSONReader.paymentDetails("cvc"));
        expireMonth.sendKeys(JSONReader.paymentDetails("expirationMonth"));
        expireYear.sendKeys(JSONReader.paymentDetails("expirationYear"));
        Thread.sleep(2000);
        confirmOrder.click();

        return new PaymentDonePage();
    }
}
