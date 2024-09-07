package com.cg.PageFactory;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cg.BrowserRead.SprintBrowserRead;

public class SprintPageFactory extends SprintBrowserRead{
	
    //(------------------------------Xpaths for login---------------------------------------------)
	static WebDriverWait wait;
	@FindBy(xpath="//a[contains(text(),'Login')]")
    WebElement login_header;
	
	@FindBy(xpath="//a[@class='mb-login__drop-cta']")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"emailOrMobile\"]")
	WebElement email_enter;
	
	@FindBy(id="btnStep1")
	WebElement next;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement button_login;
	
	//(------------------------------Xpaths for EMI Calculation-----------------------------------)
	
    @FindBy(xpath="//a[contains(text(),'Home Loans')]")
	WebElement emi_home_index;
    
	@FindBy(xpath="//*[@href='https://www.magicbricks.com/homeloan/emi-calculator']")
	WebElement emi_enter;
	
    @FindBy(xpath="//*[@id='submitbuttonEmiCalid']")
    WebElement emi_cal;
    
    //(------------------------------Xpaths for Eligibility Calculation----------------------------)
    
    @FindBy(xpath="//a[contains(text(),'Home Loans')]")
	WebElement eligible_home_index;
    
    @FindBy(xpath="//*[@href='https://www.magicbricks.com/homeloan/eligibility-calculator']")
    WebElement eligible_enter;
    
    @FindBy(xpath="//*[@id='incomePerMonthEliCal']")
    WebElement monthly_income;
    
    @FindBy(xpath="//*[@id='existingLoanEliCal']")
    WebElement ongoing_emi;
    
    @FindBy(xpath="//*[@id='submitbuttonEliCalid']")
    WebElement eligible_cal;
    
    //(------------------------------Xpaths for Prepayment Calculation-----------------------------------)
    
	@FindBy(xpath="//*[@href='https://www.magicbricks.com/homeloan/prepayment-calculator']")
	WebElement prepay_enter;
	
	@FindBy(xpath="//*[@value='Calculate']")
	WebElement prepay_cal ;
	
	//(------------------------------Xpaths for Applying Home Loans---------------------------------------)	
	
	@FindBy(xpath="//*[@href='https://www.magicbricks.com/homeloan/home?inc=desktop_homeloan_menu_linkage']")
	WebElement home_loan_enter;
	
	@FindBy(xpath="//input[@id='monthlyIncome']")
	WebElement home_loan_income;
	
	@FindBy(id="mobileNumber")
	WebElement home_loan_mobile;
	
	@FindBy(id="generate-otp")
	WebElement check_eligible;
	
	@FindBy(id="hlname")
	WebElement name;
	
	@FindBy(id="loanAmount")
	WebElement loan_amount;
	
	@FindBy(id="shortlistedN")
	WebElement shortlist;
	
	@FindBy(id="NameCityOnly")
	WebElement city_name;
	
    @FindBy(xpath="//span[@class='mb-hl__revamp-form__search__list--value']")
    WebElement city_list;
    
    @FindBy(xpath="//a[@class='mb-hl__revamp-form__action--btn']")
	WebElement contin;
    
	@FindBy(id="loantype21250")
	WebElement home_loan_type;
	
	@FindBy(id="loantype21251")
	WebElement loan_against_property;
	
    @FindBy(id="loantype21252")
	WebElement balance_transfer;
    
	@FindBy(id="emailId")
	WebElement email;
	
	@FindBy(id="age")
	WebElement age;
	
	@FindBy(id="genderF")
	WebElement gender_f;
	
	@FindBy(id="genderM")
	WebElement gender_m;
	
	@FindBy(xpath="//a[@class='mb-hl__revamp-form__action--btn']")
	WebElement contin1;
	
	@FindBy(id="empType16121")
	WebElement salaried_emp;
	
	@FindBy(id="empType16122")
	WebElement business;
	
	@FindBy(id="empType16123")
	WebElement self_employed;
	
	@FindBy(id="ongoingEMI")
	WebElement emi_ongoing;
	
	@FindBy(id="creditScoreExistsN")
	WebElement credit_score;
	
	@FindBy(id="coapplicantExistsN")
	WebElement coapplicant_exist;
	
	@FindBy(xpath="//a[@class='mb-hl__revamp-form__action--btn']")
	WebElement contin_last;
	
	@FindBy(xpath="//a[contains(text(),'Go to Home Page')]")
	WebElement home_return;
	
	@FindBy(xpath="//a[contains(text(),'Home Loans')]")
	WebElement negative_index;
	
    public SprintPageFactory() throws InterruptedException  
	{		
    	super();
		load();
	    PageFactory.initElements(driver, this);
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}
    
  //(------------------------------Method for Login ----------------------------------------------------------------)
    
    
    public void firstLogin() throws InterruptedException 
    {
    	//Handling windows
    	Set<String> windowHandles=driver.getWindowHandles();
	       for(String handle: windowHandles) 
	       {
	    	   if(!handle.equals(mainWindowHandle))
	    	   {
	    		   driver.switchTo().window(handle);
	    		   
	    		   
	    	   }
	       }
	       
	       Thread.sleep(1000); 
    	   login_header.click();
    	   Thread.sleep(1000);
    	   login.click();
    	 
    	
     }
    //(------------------------------Method for Entering Login  Credentials-------------------------------------)
     
    public void loginCredentials() throws InterruptedException
     {
    	
    	Set<String> windowHandles=driver.getWindowHandles();
	       for(String handle: windowHandles)
	       {
	    	   if(!handle.equals(mainWindowHandle)) 
	    	   {
	    		   driver.switchTo().window(handle);    		   
	    		   
	    	   }
	       }
	       
	       Thread.sleep(1000);
           email_enter.sendKeys("6305123818@mb.com");
           Thread.sleep(1000);
           next.click();
           Thread.sleep(1000);
	       password.sendKeys("Abhi@1234");
	       Thread.sleep(1000);
	       button_login.click();
	       Thread.sleep(2000);

	
	  }
    
    //(------------------------------Methods for EMI Calculator----------------------------------)
	  
    public void emiCalculator() throws InterruptedException 
	   {
		   
		 Set<String> windowHandles=driver.getWindowHandles();
	       for(String handle: windowHandles) 
	       {
	    	   if(!handle.equals(mainWindowHandle))
	    	   {
	    		   driver.switchTo().window(handle);
	    		   	   
	    	   }
	       }
	       
	       Thread.sleep(3000);
	       emi_home_index.click();
	       Thread.sleep(2000);
	       emi_enter.click();
	         
		}
   
    
		public void calculateEmi() throws InterruptedException 
		{
			
			 Set<String> windowHandles=driver.getWindowHandles();
		       for(String handle: windowHandles) 
		       {
		    	   if(!handle.equals(mainWindowHandle))
		    	   {
		    		   driver.switchTo().window(handle);
		    		      		   
		    	   }
		       }
		       
		       Thread.sleep(2000);
		       emi_cal.click();
		       
		}
		
		//(------------------------------Method for Eligibility Calculator----------------------------------)
		
		public void eligibilityCalculator() throws InterruptedException {
			
			 Set<String> windowHandles=driver.getWindowHandles();
		       for(String handle: windowHandles)
		       {
		    	   if(!handle.equals(mainWindowHandle))
		    	   {
		    		   driver.switchTo().window(handle);
		    		   	   
		    	   }
		       }
		       
		       Thread.sleep(2000);
		       eligible_home_index.click();
		       Thread.sleep(2000);
		       eligible_enter.click();
	
		}
		
		public void calculateEligibility() throws InterruptedException
		{
			
			 Set<String> windowHandles=driver.getWindowHandles();
		       for(String handle: windowHandles)
		       {
		    	   if(!handle.equals(mainWindowHandle)) 
		    	   {
		    		   driver.switchTo().window(handle);
		    		   
		    	   }
		       }
		       
		       monthly_income.sendKeys("36000");
		       Thread.sleep(2000);
		       ongoing_emi.sendKeys("15000");
		       Thread.sleep(2000);
		       eligible_cal.click();
		       
		 }
		

		//(------------------------------Methods for Prepayment Calculator----------------------------------)
		
        public void prepaymentCalculator() throws InterruptedException
        {
        	
		 Set<String> windowHandles=driver.getWindowHandles();
	       for(String handle: windowHandles) 
	       {
	    	   if(!handle.equals(mainWindowHandle))
	    	   {
	    		   driver.switchTo().window(handle);
	    		   
	    		   
	    	   }
	       }
	       
	       eligible_home_index.click();
	       Thread.sleep(2000);
	       prepay_enter.click();
	       Thread.sleep(2000);
	      
	      }
        public void calculatePrepayment() throws InterruptedException 
        {
        	
		 Set<String> windowHandles=driver.getWindowHandles();
	       for(String handle: windowHandles)
	       {
	    	   if(!handle.equals(mainWindowHandle))
	    	   {
	    		   driver.switchTo().window(handle);
	    		    		   
	    	   }
	       }
	       
	       prepay_cal.click();
	       Thread.sleep(2000);
	       driver.navigate().to("https://www.magicbricks.com/");
	       
	       }
        
      //(------------------------------Methods for Applying Home Loans----------------------------------)
        
	      public void openHome() throws InterruptedException 
	      {
	     	  
		    Thread.sleep(5000);
	        emi_home_index.click();
	        Thread.sleep(2000);
	        home_loan_enter.click();
	        
           }
    
	     public void applyHomeLoan() throws InterruptedException 
	     {
	    	 
		 Set<String> windowHandles=driver.getWindowHandles();
	       for(String handle: windowHandles)
	       {
	    	   if(!handle.equals(mainWindowHandle)) 
	    	   {
	    		   driver.switchTo().window(handle);
	    		    		   
	    	   }
	       } 
	       //(------------------------------Page 1 Filling Credentials----------------------------------)  
	       
	           home_loan_income.sendKeys("26000");
		       Thread.sleep(3000);
		       check_eligible.click();
		       Thread.sleep(3000);
		       name.clear();
		       Thread.sleep(3000);
		       name.sendKeys("Rasagna");
		       Thread.sleep(2000);
		       loan_amount.sendKeys("400000");
		       Thread.sleep(2000);
		       shortlist.click();
		       Thread.sleep(2000);
		       city_name.clear();
		       Thread.sleep(2000);
		       city_name.sendKeys("Chennai");
		       Thread.sleep(3000);
		       city_list.click();
		       Thread.sleep(2000);
		       contin.click();
		       Thread.sleep(2000);
		       
		       //(------------------------------Page 2 Filling Credentials----------------------------------)  
		       
		       home_loan_type.click();
		       Thread.sleep(2000);
		       email.clear();
		       Thread.sleep(3000);
		       email.sendKeys("boda@gmail.com");
		       age.clear();
		       age.sendKeys("45");
		       Thread.sleep(2000);
		       gender_f.click();
		       Thread.sleep(2000);
		       contin1.click();
		       
		       //(------------------------------Page 3 Filling Credentials----------------------------------)
		       
		       Thread.sleep(2000);
		       salaried_emp.click();
		       Thread.sleep(2000);
		       emi_ongoing.click();
		       Thread.sleep(2000);
		       credit_score.click();
		       Thread.sleep(2000);
		       coapplicant_exist.click();
		       Thread.sleep(2000);
		       contin_last.click();
		       Thread.sleep(2000);
		       home_return.click();
		       
	     }		  
	     
	   //(------------------------------Methods for Applying loan Against Property----------------------------------)
	        
        public void loanAgainstProperty() throws InterruptedException 
        {
	     Set<String> windowHandles=driver.getWindowHandles();
         for(String handle: windowHandles) 
         {
  	     if(!handle.equals(mainWindowHandle))
  	     {
  		   driver.switchTo().window(handle);
  		   		   
  	      }
         }
       //(------------------------------Page 1 Filling Credentials----------------------------------)  
           Thread.sleep(3000);
           home_loan_income.clear();
           home_loan_income.sendKeys("30000");
	       Thread.sleep(5000);
	       check_eligible.click();
	       Thread.sleep(4000);
	       name.clear();
	       Thread.sleep(3000);
	       name.sendKeys("Abhinaya");
	       Thread.sleep(2000);
	       loan_amount.sendKeys("500000");
	       Thread.sleep(2000);
	       shortlist.click();
	       Thread.sleep(2000);
	       city_name.clear();
	       Thread.sleep(2000);
	       city_name.sendKeys("Hyderabad");
	       Thread.sleep(3000);
	       city_list.click();
	       Thread.sleep(2000);
	       contin.click();
	     //(------------------------------Page 2 Filling Credentials----------------------------------)  
	       Thread.sleep(2000);
	       loan_against_property.click();
	       Thread.sleep(2000);
	       email.clear();
	       email.sendKeys("abhinaya@gmail.com");
	       Thread.sleep(2000);
	       age.clear();
	       age.sendKeys("25");
	       Thread.sleep(2000);
	       gender_m.click();
	       Thread.sleep(2000);
	       contin1.click();
	     //(------------------------------Page 3 Filling Credentials----------------------------------)  
	       Thread.sleep(2000);
	       business.click();
	       Thread.sleep(2000);
	       emi_ongoing.click();
	       Thread.sleep(2000);
	       credit_score.click();
	       Thread.sleep(2000);
	       coapplicant_exist.click();
	       Thread.sleep(2000);
	       contin_last.click();
	       Thread.sleep(2000);
	       home_return.click();
	       Thread.sleep(2000);
	            
          }
        
        //(------------------------------Methods for Applying Balance Tranfer----------------------------------)
        
         public void balanceTranfer() throws InterruptedException 
         {
	      Set<String> windowHandles=driver.getWindowHandles();
           for(String handle: windowHandles)
           {
 	        if(!handle.equals(mainWindowHandle)) 
 	        {
 	        	
 		    driver.switchTo().window(handle);
 		    
 	        }
         }
         //(------------------------------Page 1 Filling Credentials----------------------------------)  
           Thread.sleep(3000);
           home_loan_income.clear();
           home_loan_income.sendKeys("40000");
           Thread.sleep(7000);
           check_eligible.click();
	       Thread.sleep(5000);
	       name.clear();
	       Thread.sleep(2000);
	       name.sendKeys("VasanathaJay");
	       Thread.sleep(2000);
	       loan_amount.sendKeys("600000");
	       Thread.sleep(2000);
	       shortlist.click();
	       city_name.clear();
	       Thread.sleep(2000);
	       city_name.sendKeys("Delhi");
	       Thread.sleep(2000);
	       city_list.click();
	       Thread.sleep(2000);
	       contin.click();
	     //(------------------------------Page 2 Filling Credentials----------------------------------)  
	       Thread.sleep(2000);
	       balance_transfer.click();
	       Thread.sleep(2000);
	       email.clear();
	       email.sendKeys("vasanthajay@gmail.com");
	       Thread.sleep(2000);
	       age.clear();
	       age.sendKeys("60");
	       gender_f.click();
	       Thread.sleep(2000);
	       contin1.click();
	       
	     //(------------------------------Page 3 Filling Credentials----------------------------------)  
	       Thread.sleep(2000);
	       self_employed.click();
	       Thread.sleep(2000);
	       emi_ongoing.sendKeys("15000");
	       Thread.sleep(2000);
	       credit_score.click();
	       Thread.sleep(2000);
	       coapplicant_exist.click();
	       Thread.sleep(2000);
	       contin_last.click();
	       Thread.sleep(2000);
	       home_return.click();
	       Thread.sleep(2000);
	       
	    //(------------------------------Navigating To Main Page----------------------------------)
	       
	       driver.navigate().to("https://www.magicbricks.com/");
	
         } 

         //(------------------------------Methods for Negative Case----------------------------------)
         
        
		public void homeNegative(String month,String mob) throws IOException, InterruptedException
        {
	    Set<String> windowHandles=driver.getWindowHandles();
	    for(String handle: windowHandles) 
	    {
	 	   if(!handle.equals(mainWindowHandle))
	 	   {
	 		   driver.switchTo().window(handle);
	 	   }
	    }
	    
	       Thread.sleep(3000);
	       home_loan_income.sendKeys(month);
	       wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	       wait.until(ExpectedConditions.elementToBeClickable(home_loan_mobile));
	       home_loan_mobile.sendKeys(mob);
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       check_eligible.click();
	       name.sendKeys("VasanathaJay");
 
	    //(------------------------------Navigating To Main Page----------------------------------)
	       driver.navigate().to("https://www.magicbricks.com/");
      
        }
        
        
	    public void emi() 
	    {
	
		   driver.get("https://www.magicbricks.com/homeloan/emi-calculator");
	      
	    }
	    public void eligible() 
	     {
		
		    driver.get("https://www.magicbricks.com/homeloan/eligibility-calculator");
	     
	     }
	    public void prepay() 
	      {
		
	        driver.get("https://www.magicbricks.com/homeloan/prepayment-calculator");
	    
	      }
	    public void verifyHomeLoans()
	    {
		
		    driver.get(" https://www.magicbricks.com/homeloan/home?inc=desktop_homeloan_menu_linkage");
	      
	    }
	  
}
