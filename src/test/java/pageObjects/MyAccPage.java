package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccPage extends BasePage{
    public MyAccPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement myAccHeading;

    public boolean isMyAccPageExist(){
        try {
            return (myAccHeading.isDisplayed());

        }
        catch (Exception e){
            return false;
        }
    }
}
