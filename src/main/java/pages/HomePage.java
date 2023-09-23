package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[1]")
    private WebElement addToCartButton;
    @FindBy(xpath = "(//u[normalize-space()='View Cart'])[1]")
    private WebElement viewCartButton;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    public String veifyPageTitle(){
        return driver.getTitle();

    }
    public void clickOnaddToCart(){
        addToCartButton.click();
    }
    public ViewCartPage clickOnViewCart(){
        viewCartButton.click();
        return new ViewCartPage();
    }
}
