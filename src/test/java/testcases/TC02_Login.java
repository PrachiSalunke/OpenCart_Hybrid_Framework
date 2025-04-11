package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccPage;
import testBase.BaseClass;

public class TC02_Login extends BaseClass {
    @Test
    public void verifyLogin(){
        HomePage hp=new HomePage(driver);
        hp.clickMyAcc();
        hp.clickLoginLink();
        LoginPage lp=new LoginPage(driver);
        lp.setTxt_userName(p.getProperty("username"));
        lp.setTxt_password("password");
        lp.setBtn_login();

        MyAccPage map=new MyAccPage(driver);
        boolean targetPage=map.isMyAccPageExist();
        Assert.assertEquals(targetPage,true);
    }
}
