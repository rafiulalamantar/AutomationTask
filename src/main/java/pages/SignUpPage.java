package pages;

import base.TestBase;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.JSONReader;

import java.io.IOException;

public class SignUpPage extends TestBase {
    @FindBy(xpath = "(//input[@placeholder='Name'])[1]")
    private WebElement name;
    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement email;
    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signupButton;
    @FindBy(xpath = "//input[@id='id_gender1']")
    private WebElement gender;
    @FindBy(css = "#password")
    private WebElement password;
    @FindBy(xpath = "(//select[@id='days'])[1]")
    private WebElement selectDay;
    @FindBy(xpath = "//select[@id='months']")
    private WebElement selectMonth;
    @FindBy(xpath = "//select[@id='years']")
    private WebElement selectYear;
    @FindBy(css = "#first_name")
    private WebElement firstName;
    @FindBy(css = "#last_name")
    private WebElement lastName;
    @FindBy(css = "#address1")
    private WebElement address;
    @FindBy(xpath = "//select[@id='country']")
    private WebElement country;
    @FindBy(xpath = "//input[@id='state']")
    private WebElement state;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement city;
    @FindBy(xpath = "//input[@id='zipcode']")
    private WebElement zipCode;
    @FindBy(xpath = "//input[@id='mobile_number']")
    private WebElement mobileNumber;
    @FindBy(css = "button[data-qa='create-account']")
    private WebElement createAccount;
    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }

    public AccountCreatePage signupForm() throws InterruptedException, IOException, ParseException {
        password.sendKeys(prop.getProperty("password"));
        firstName.sendKeys(JSONReader.accountDetails("firstName"));
        lastName.sendKeys(JSONReader.accountDetails("lastName"));
        address.sendKeys(JSONReader.accountDetails("address"));
        country.sendKeys(JSONReader.accountDetails("country"));
        state.sendKeys(JSONReader.accountDetails("state"));
        city.sendKeys(JSONReader.accountDetails("city"));
        zipCode.sendKeys(JSONReader.accountDetails("zipcode"));
        mobileNumber.sendKeys(JSONReader.accountDetails("mobileNumber"));
        createAccount.click();
        return new AccountCreatePage();
    }
}
