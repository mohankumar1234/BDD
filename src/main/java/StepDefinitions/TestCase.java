package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Homepage;
import POM.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCase {

	WebDriver driver;
	String mainwindow;
	
	@When ("^I enter URL$")
	public void launchurl()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mogan\\Desktop\\Jar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}
	
	@When ("^Home page displayed$")
	public void validatehomepage()
	{
		assertEquals (driver.getCurrentUrl(), "http://demowebshop.tricentis.com/");
	}
	
	
	
	@Then ("^Register button should be visible$")
	public void validateRegisterButton()
	{
		assertEquals (driver.findElement(By.xpath("//li/a[text() = 'Register']")).getText() , "Register");
	}
	
	@When ("^I click youtube button$")
	public void clickYoutube()
	{
		mainwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//li/a[text() = 'YouTube']")).click();
	}
	
	@Then ("^YouTube website should be opened in new tab$")
	public void validateYoutubeButton()
	{
	/*	String mainwindow = "cd";
		Set <String> windows = driver.getWindowHandles();
		for (String a : windows)
		{
			if (!a.equals(mainwindow))
			{
				assertEquals ("https://www.youtube.com/user/nopCommerce" , )
	*/
		assertEquals ("https://www.youtube.com/user/nopCommerce" , driver.getCurrentUrl());
		driver.switchTo().window(mainwindow);
		driver.close();
	}
	
	@When ("^I click \"(.*)\" j button$")
	public void click(String axn)
	{
		mainwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//li/a[text() = '"+axn+"']")).click();
	}
		
	@Then ("^I Verify \"(.*)\" is opened in new Tab$")
	public void verifytab(String expectedurl) throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println(mainwindow  + "  "+ driver.getCurrentUrl());
		assertEquals (driver.getCurrentUrl() , expectedurl);
		driver.switchTo().window(mainwindow);
		driver.close();
	}
//-------------------------	
	@When ("^I click \"(.*)\" in home page top menu$")
	public void clickhomepagetopmenu(String button)
	{
		driver.findElement(By.xpath("//li/a[text() = '"+button+"']")).click();
	}
	
	@Then ("^\"(.*)\" page should be displayed and validate title$")
	public void validatehomepagetopmenu(String button)
	{

		switch (button)
		{
		case "Register":
			driver.findElement(By.xpath("//li/a[text() = 'Register']")).click();
			assertEquals (driver.getTitle() , "Demo Web Shop. Register");
			break;
		
		case "Log in":
			driver.findElement(By.xpath("//li/a[text() = 'Log in']")).click();
			assertEquals (driver.getTitle() , "Demo Web Shop. Login");
			break;
			
		case "Shopping cart":
			driver.findElement(By.xpath("//li/a[text() = 'Shopping cart']")).click();
			assertEquals (driver.getTitle() , "Demo Web Shop. Shopping Cart");
			break;
			
		case "Wishlist":
			driver.findElement(By.xpath("//li/a[text() = 'Wishlist']")).click();
			assertEquals (driver.getTitle() , "Demo Web Shop. Wishlist");
			break;
			
		default:
			System.out.println(driver.getCurrentUrl() +"^"+ driver.getTitle());
		
		}
		
	}
	
	@And ("^I Click on Login button$")
	public void clicklogin()
	{
		Homepage obj1 = new Homepage(driver);
		obj1.click();
	}
	
	@Then ("^I enter \"(.*)\" and \"(.*)\" and click login$")
	public void entercredentials(String Email, String Password)
	{
		Login obj1 = new Login(driver);
		obj1.enteremail(Email);
		obj1.enterpassword(Password);
		obj1.clicklogin();
		
	}
	
	@Then ("^I validate \"(.*)\" visible at top menu$")
	public void validatelogin(String Email)
	{
		Homepage obj1 = new Homepage(driver);
		assertEquals(obj1.getusername() , Email);
	}
	
	@And ("^I quit browser$")
	public void quitbrowser()
	{
		driver.quit();
	}
	
}
