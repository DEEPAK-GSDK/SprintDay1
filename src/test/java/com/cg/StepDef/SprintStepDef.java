package com.cg.StepDef;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.cg.PageFactory.SprintPageFactory;
import io.cucumber.java.en.*;

    public class SprintStepDef 
    
    {
	
    WebDriver driver;
    SprintPageFactory pf;
     @Given("User is on Home Page")
    public void user_is_on_home_page() throws InterruptedException {
    	
    	pf=new SprintPageFactory();
      
    }


    //(-----------------------------Calling Login Methods---------------------------------------------)
    
    @Given("User clicks Home Loans section")
    public void user_clicks_home_loans_section() throws InterruptedException {

    	pf.firstLogin();
	    pf.loginCredentials();

	}
    
    //(------------------------------Calling EMI Methods------------------------------------------------)
 
    @When("selects Calculate EMI")
    public void selects_calculate_emi() throws InterruptedException {
    	
    	pf.emiCalculator();
      
    }
    @When("User calculates EMI")
    public void user_calculates_emi() throws InterruptedException {
    
    	 pf.calculateEmi();
     }
    
    //(------------------------------Calling Eligibility Methods----------------------------------------)
    
    @When("user selects Eligibility")
	public void user_selects_eligibility() throws InterruptedException {

		   pf.eligibilityCalculator();
		

	}

    @When("User Calculates Eligibility")
    public void user_calculates_eligibility() throws InterruptedException {
    	
    	pf.calculateEligibility();
    
    }
    //(------------------------------Calling Prepayment Methods-----------------------------------------)
  
    @Then("User Selects Prepayment Savings")
    public void user_selects_prepayment_savings() throws InterruptedException {
    	
		pf.prepaymentCalculator();
       
    }
   

    @Then("User Calculates Prepayment Savings")
    public void user_calculates_prepayment_savings() throws InterruptedException {
 
    	pf.calculatePrepayment();
	    
	}
    //(------------------------------Calling  Apply Home Loans Methods------------------------------------)
    
    @Given("User opens Home Loans section")
    public void user_opens_home_loans_section() throws InterruptedException {
    	
    	 pf.firstLogin();
  	     pf.loginCredentials();
  	     pf.openHome();
 
	}
   

    @Given("User Applies for Home Loan")
    public void user_applies_for_home_loan() throws InterruptedException {
    	
		 pf.applyHomeLoan();
	   
	}
	
    //(------------------------------Calling  Apply loan Against Property Methods------------------------)
    
    @Given("User applies for Loan against property")
    public void user_applies_for_loan_against_property() throws InterruptedException {

    	pf.loanAgainstProperty();
    	
    	
    }
    //(------------------------------Calling  Apply Balance Transfer Methods------------------------------)
    
   @When("User Applies for Balance Transfer")
    public void user_applies_for_balance_transfer() throws InterruptedException {
    	
    	pf.balanceTranfer();

    	
    }
 //(------------------------------Calling  Negative Case methods---------------------------------)
   
    @When("the user clicks on {string} and {string}")
	public void the_user_clicks_on_and(String string, String string2) throws InterruptedException, IOException {
	   
		pf.openHome();
		pf.homeNegative(string,string2);
		Assert.assertTrue(true,"Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks");
		System.out.println("User is on HomePage");
		
		
	}


}

