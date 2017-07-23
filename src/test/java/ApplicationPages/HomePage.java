package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
 WebDriver driver;
 
 public HomePage (WebDriver ldriver){
	 
	 this.driver = ldriver;
	 
 }
	@FindBy (xpath ="//span[test() ='Home']")
	WebElement HomeLink;
	
	@FindBy (xpath ="//span[test() ='My Account']")
	WebElement MyAccountLink;	
	
	@FindBy (xpath ="//span[test() ='My Cart']")
	WebElement  MyCartLink;
	
	@FindBy (xpath ="//span[test() ='Wishlist']")
	WebElement WishlistLink;
	
	@FindBy (xpath ="//span[test() ='Log In']")
	WebElement LogInLink;
	
	
	public void clickOnHomeLink(){
		HomeLink.click();
	
	}
	
	public void clickOnMyAccountLink(){
		MyAccountLink.click();
	
	}
	
	
	public void clickOnMyCartLink(){
		MyCartLink.click();
	
	}
	
	public void clickOnWishlistLink(){
		WishlistLink.click();
	
	}
	
	
	public void clickOnLogInLink(){
		LogInLink.click();
	
	}
	
	public String getApplicationTitle(){
		
		return (driver.getTitle());
		
	}
	}
	

