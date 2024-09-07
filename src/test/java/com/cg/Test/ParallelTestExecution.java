package com.cg.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ParallelTestExecution {

    WebDriver driver;
  //(------------------------------Opening MagicBricks----------------------------------)  
    @Test
    public void Test1Execution() throws InterruptedException

    {

        System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.magicbricks.com/");
        Thread.currentThread();
		System.out.println("Test 1  "+Thread.activeCount());

    }
  //(------------------------------Opening Google----------------------------------)
    @Test

    public void Test2Execution() throws InterruptedException

    {

        System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
        driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.currentThread();
		System.out.println("Test 2 "+Thread.activeCount());
  
    }
    
}
