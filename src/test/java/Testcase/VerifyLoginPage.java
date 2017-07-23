package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.HomePage;
import ApplicationPages.LoginPage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class VerifyLoginPage {

	WebDriver driver;
	LoginPage login ;
	HomePage home ;

	@BeforeMethod
	public void setup(){
		
		driver = BrowserFactory.getBrowser("Chrome");
		driver.get(DataProviderFactory.getConfig().getApplicationURL());
		
	}
	
	  @Test
	  public void testLoginPage(){
	     	 
	     	 home.clickOnLogInLink();
	    	 HomePage home = PageFactory.initElements(driver, HomePage.class);
	    	 //class initialised
	    	 String title = home.getApplicationTitle();
	    	 Assert.assertTrue(title.contains("Avactis Demo Store"));
	    	 
	    	 LoginPage login =PageFactory.initElements(driver,)
	     	 
	      }

}
