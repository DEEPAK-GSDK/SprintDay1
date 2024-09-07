package com.cg.BrowserRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.cg.CustomException.BrowserNotSupportedException;
import org.openqa.selenium.chrome.ChromeOptions;

public class SprintBrowserRead {
	
	public static WebDriver driver;
	public String mainWindowHandle;
	Properties prop;
	String bname;
	 //(------------------------------Reading From Config----------------------------------)
	
	public SprintBrowserRead()
	{
		prop= new Properties();
		try {
			
			prop.load(new FileInputStream("config/config.properties"));
			bname=prop.getProperty("browser");
			if(bname.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
				
				
			}
			else if(bname.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.firefox.driver","driver//geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else
			{
				throw new BrowserNotSupportedException(bname+"Not supported here");
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (BrowserNotSupportedException e) {
		
			e.printStackTrace();
		}
		
	}
	
	 //(------------------------------Getting URL----------------------------------)
	
	
	
	
	public void load()
	{
		ChromeOptions opt=new ChromeOptions();
	    opt.addArguments("--disable-notifications");
	    driver=new ChromeDriver(opt);
	    driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		mainWindowHandle=driver.getWindowHandle();
		
		}
	

}
