package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement txt_userName;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement txt_password;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement btn_login;

    public void setTxt_userName(String uName){
        txt_userName.sendKeys(uName);
    }
   public void setTxt_password(String pass){
        txt_password.sendKeys(pass);
    }
    public void setBtn_login(){
        btn_login.click();
    }

}
