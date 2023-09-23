package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPage extends TestBase {
    @FindBy(css = ".btn.btn-default.check_out")
    private WebElement proceedToCheckOut;
    @FindBy(xpath = "(//u[normalize-space()='Register / Login'])[1]")
    private WebElement registerButton;
    public ViewCartPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickOnProceedToCheckOut(){
        proceedToCheckOut.click();
    }
    public LoginPage clickOnRegisterButton(){
        registerButton.click();
        return new LoginPage();
    }
}
