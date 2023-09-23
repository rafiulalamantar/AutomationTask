package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatePage extends TestBase {
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    private WebElement continueButton;
    public AccountCreatePage(){
        PageFactory.initElements(driver, this);
    }
    public HomePageWithLogin clickOnContinueButton(){
        continueButton.click();
        return new HomePageWithLogin();
    }
}
