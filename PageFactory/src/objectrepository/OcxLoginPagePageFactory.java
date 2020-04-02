package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OcxLoginPagePageFactory { //Page Factory difference from PageObject is how we write the objects 
	
	WebDriver driver;
	public  OcxLoginPagePageFactory (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); // as a plus for the page factory in comparison to page object
	}
	
	@FindBy (xpath=".//*[@id='username']")
	WebElement username; 

	@FindBy (xpath=".//*[@id='username']")
	WebElement password;
	
	@FindBy (xpath="\".//*[@class='login']//*[@class='form-validate form-horizontal well']//*[@type='submit']\"")
	WebElement btnLogin;
	
	@FindBy (xpath="\".//*[@class='row-fluid']//li[2]//a[@class='pathway']\"")
	WebElement btnHome;
	
	public WebElement username()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement btnLogin()
	{
		return btnLogin;
	}
	
	public WebElement btnHome()
	{
		return btnHome;
	}
}

