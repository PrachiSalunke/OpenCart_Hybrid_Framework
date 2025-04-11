package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC01_Registration extends BaseClass {
    public WebDriver driver;


    @Test
    void vefifyAccRegistration() throws InterruptedException {
      // logger.info("******Started TC01_Registration*******");
        HomePage hp=new HomePage(driver);
        hp.clickMyAcc();
        hp.clickRegisterLink();
        Thread.sleep(5000);

        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.setTxt_firstName(randomeString());
        registerPage.setTxt_lastName(randomeString());
        registerPage.setTxt_email(randomeString()+"@gmail.com");
        registerPage.setTxt_telephone(randomeNumber());
        String pass=randomeAlphaNo();
        registerPage.setTxt_password(pass);
        registerPage.setTxt_confirmPassword(pass);
        registerPage.setRd_subscribe();
        registerPage.setChbox_policy();
        registerPage.setBtn_countinue();
      //  logger.info("******Ended TC01_Registration*******");
    }

}
