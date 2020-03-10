package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;

	@FindBy(xpath = "//li/a[text() = 'Register']")
	WebElement lnkRegister;
	@FindBy(xpath = "//li/a[text() = 'Log in']")
	WebElement lnkLogin;
	@FindBy(xpath = "//li/a[text() = 'Shopping cart']")
	WebElement lnkShoppingcart;
	@FindBy(xpath = "//li/a[text() = 'Wishlist']")
	WebElement lnkWishlist;
	@FindBy(xpath = "(//li/a[text() = 'Log out']/parent::li/parent::ul/li/a)[1]")
	WebElement lnkusername;
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click()
	{
		lnkLogin.click();
		
	}
	
	public String getusername()
	{
		return lnkusername.getText();
	}

}
