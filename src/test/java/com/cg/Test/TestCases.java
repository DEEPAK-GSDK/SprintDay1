package com.cg.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.cg.PageFactory.*;

	public class TestCases extends SprintPageFactory{

	   public TestCases() throws InterruptedException
	   {
		   super();
		   System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://www.magicbricks.com/");
		   driver.manage().window().maximize();

	   }
	   
	 //(------------------------------Verifying Home Page----------------------------------)
	   
	   @Test(priority=1)
	   public void HomePageTitleVerify() {
           Assert.assertEquals(driver.getTitle(), "Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks");
           System.out.println("Verification of Home Page done");
           //driver.close();

	    }

	   //(------------------------------Verifying Login Page----------------------------------)
	   
	   @Test(priority=2)
	    public void loginpageVerify() {
       	
		   driver.get("https://accounts.magicbricks.com/userauth/login");
           Assert.assertEquals(driver.getTitle(), "User Login");
           System.out.println("Verification of login Page done");
           

	    }
	   
	   //(------------------------------Verifying EMI Calculator Page----------------------------------)
	   
	   @Test(priority=3)
	   public void emicalculator() throws InterruptedException

	   {
		   Thread.sleep(5000);
		   emi();
		   Assert.assertEquals(driver.getTitle(),"Home Loan EMI Calculator: Calculate Home Loan Interest & EMI Online");
	       System.out.println("Verification of EMI calculator done");
		 
		    
	   }
	   
	   //(------------------------------Verifying Eligible Calculator Page----------------------------------)
	   
	   
        @Test(priority=4)
	    public void eligibilitycalculator() {
       
		   eligible();
		   Assert.assertEquals(driver.getTitle(),"Home Loan Eligibility Calculator - Check Your Home Loan Eligibility");
           System.out.println("Verification of Eligibility calculator done");
           
            
	   }
        //(------------------------------Verifying Prepayment Calculator Page----------------------------------)
 	   
        @Test(priority=5)
 	   public void prepayver() throws InterruptedException

 	   {
 		   Thread.sleep(5000);
 		   prepay();
 		   Assert.assertEquals(driver.getTitle(),"Home Loan Prepayment Calculator - Calculate Prepayment Loan Online");
 		   System.out.println("Verification of prepayment calculator done");
 	   }
        
        //(------------------------------Verifying Applying Home Loans----------------------------------)
 	   
	   @Test(priority=6)
	  public void verifyHomeLoans() {
		   
		  verifyHomeLoans();
		  Assert.assertEquals(driver.getTitle(),"Home Loan Prepayment Calculator - Calculate Prepayment Loan Online");
		  System.out.println("This is not Apply Home loans page");
		  driver.quit();
	  }
	
	   
	
	   
	   
	}



