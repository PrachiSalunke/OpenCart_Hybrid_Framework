package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class BaseClass {
    public WebDriver driver;

  public Logger logger;
  public Properties p;
   @BeforeClass
    @Parameters({"os","browser"})
    void setUp(String os,String br) throws IOException {
       FileReader file=new FileReader("/src//test//resources//config.properties");
       p=new Properties();
       p.load(file);
     logger=LogManager.getLogger(this.getClass());
        switch (br.toLowerCase()){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "Edge":
                driver=new EdgeDriver();
                break;
            default:
                System.out.println("Invalid browser");
                return;
        }

        driver.get("https://tutorialsninja.com/demo/index.php?");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }
    public String randomeString(){
        String generatedString= RandomStringUtils.randomAlphabetic(5);
        return generatedString;
    }
    public String randomeNumber(){
        String generatedNumber= RandomStringUtils.randomNumeric(10);
        return randomeNumber();
    }
    public String randomeAlphaNo(){
        String generatedAlphaNo= RandomStringUtils.randomAlphanumeric(10);
        return randomeAlphaNo();
    }
}
