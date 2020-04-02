package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OcxHomePagePageFactory {
	
	WebDriver driver;
	public  OcxHomePagePageFactory (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy (xpath=".//*[@id='input_search211']")
	WebElement inputSearchKeyword;
	
	@FindBy (xpath=".//*[@class='search_buttons']//*[@type='submit']")
	WebElement btnSearch;
	
	public WebElement inputSearchKeyword ()
	{
		return inputSearchKeyword;
	}
	
	public WebElement btnSearch()
	{
		return btnSearch;
	}
}

