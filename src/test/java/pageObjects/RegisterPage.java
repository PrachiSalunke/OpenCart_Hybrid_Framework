package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver){
       super(driver);
    }

    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement txt_firstName;

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement txt_lastName;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement txt_email;

    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement txt_telephone;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement txt_password;

    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement txt_confirmPassword;

    @FindBy(xpath = "//input[@value='0']")
    WebElement rd_subscribe;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement chbox_policy;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement btn_countinue;

    public void setTxt_firstName(String fName){
        txt_firstName.sendKeys(fName);
    }
    public void setTxt_lastName(String lName){
        txt_lastName.sendKeys(lName);
    }
    public void setTxt_email(String email){
        txt_email.sendKeys(email);
    }
    public void setTxt_telephone(String telephone){
        txt_telephone.sendKeys(telephone);
    }
    public void setTxt_password(String pass){
        txt_password.sendKeys(pass);
    }
    public void setTxt_confirmPassword(String conPass){
        txt_confirmPassword.sendKeys(conPass);
    }
    public void setRd_subscribe(){
        rd_subscribe.click();
    }
    public void setChbox_policy(){
        chbox_policy.click();
    }
    public void setBtn_countinue(){
        btn_countinue.click();
    }
}
