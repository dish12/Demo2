package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.HomePage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class VerifyHomePage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		
		driver = BrowserFactory.getBrowser("Chrome");
		driver.get(DataProviderFactory.getConfig().getApplicationURL());
	}
	
     @Test
 public void testHomePage(){
    	 
    	 HomePage home = PageFactory.initElements(driver, HomePage.class);
    	 //class initialised
    	 String title = home.getApplicationTitle();
    	 Assert.assertTrue(title.contains("Avactis Demo Store"));
    	 
     }
     
     @AfterMethod
     
     public void tearDown(){
    	 
    	 BrowserFactory.closeBrowser(driver);
    	 
     }
     }
