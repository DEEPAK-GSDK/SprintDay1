package com.cg.StepDefCSV;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.cg.CsvRead.CsvRead;

 public class TestReader {

	WebDriver driver;
    @BeforeTest

    public void init()

    {

    System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://accounts.magicbricks.com/userauth/login");
    driver.manage().window().maximize();
    
    }
    @Test(dataProvider="csv",dataProviderClass=CsvRead.class)

    public void read(Map<String,String> c)  throws InterruptedException 
    {
   
       String em=c.get("email");
       String pass=c.get("password");
       
       driver.findElement(By.id("emailOrMobile")).sendKeys(em);
       driver.findElement(By.id("btnStep1")).click();
       driver.findElement(By.id("password")).sendKeys(pass);
       driver.findElement(By.id("btnLogin")).click();
       
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//a[@class='mb-header__main__link js-menu-link normal-user']")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
       
    }
    
 }
    
