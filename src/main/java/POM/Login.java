package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	@FindBy(xpath = "//li/a[text() = 'Register']")
	WebElement lnkRegister;
	@FindBy(xpath = "//li/a[text() = 'Log in']")
	WebElement lnkLogin;
	@FindBy(xpath = "//li/a[text() = 'Shopping cart']")
	WebElement lnkShoppingcart;
	@FindBy(xpath = "//li/a[text() = 'Wishlist']")
	WebElement lnkWishlist;
	
	@FindBy(xpath = "//div/input[@id = 'Email']")
	WebElement txtEmail;
	@FindBy(xpath = "//div/input[@id = 'Password']")
	WebElement txtPassword;
	@FindBy(xpath = "//div/input[@value = 'Log in']")
	WebElement btnlogin;
	
	
	public Login(WebDriver driver)
	{
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enteremail(String Email)
	{
		txtEmail.sendKeys(Email);
	}
	
	public void enterpassword(String Password)
	{
		txtPassword.sendKeys(Password);
	}
	
	public void clicklogin()
	{
		btnlogin.click();
	}
	
	

}
