package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "(//input[@placeholder='Name'])[1]")
    private WebElement name;
    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement email;
    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signupButton;
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    public SignUpPage registerUser() throws InterruptedException {
        name.sendKeys(prop.getProperty("name"));
        Thread.sleep(3000);
        email.sendKeys(prop.getProperty("email"));
        signupButton.click();
        return new SignUpPage();
    }
}
