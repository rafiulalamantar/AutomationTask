package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageWithLogin extends TestBase {
    @FindBy(css = "body > header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")
    private WebElement cartButton;
    @FindBy(css = ".btn.btn-default.check_out")
    private WebElement proceedToCheckOut;
    public HomePageWithLogin(){
        PageFactory.initElements(driver, this);
    }

    public ViewCartPageWithLogin clickOnCartButton() {
        cartButton.click();
        return new ViewCartPageWithLogin();
    }

}
