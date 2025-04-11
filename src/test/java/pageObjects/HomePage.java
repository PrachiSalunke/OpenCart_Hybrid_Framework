package pageObjects;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//a[@title='My Account']")
    WebElement accLink;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
    WebElement registerLink;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement loginLink;

    public void clickMyAcc(){
        accLink.click();
    }
    public void clickRegisterLink(){
        registerLink.click();
    }
    public void clickLoginLink(){
        loginLink.click();
    }
}
