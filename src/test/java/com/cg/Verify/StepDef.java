package com.cg.Verify;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cg.ExcelRead.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


 public class StepDef
   {

	public String mainWindowHandle;
	WebDriver driver;
	@Given("the user is on home loan page")
	public void the_user_is_on_home_loan_page() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.magicbricks.com/");
        driver.manage().window().maximize();
        driver.get("https://accounts.magicbricks.com/userauth/login");
        
    }
	//(------------------------------Reading from Excel----------------------------------)  
	
    @When("user enter details {string} and {int}")

    public void user_enter_details_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
    	
    	 
    	ExcelReader read=new ExcelReader();
        List<Map<String, String>> test=read.getData("C:\\Users\\BRASAGNA\\Downloads\\ExcelRead.xlsx", sheetname);
        String em=test.get(rownumber).get("email");
        String pass=test.get(rownumber).get("password");
        
        driver.findElement(By.xpath("//*[@id=\"emailOrMobile\"]")).sendKeys(em);
        driver.findElement(By.id("btnStep1")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
        driver.findElement(By.id("btnLogin")).click();

     

    }

    @Then("user login sucessfully")

    public void user_login_sucessfully() 
    {

    }
}
