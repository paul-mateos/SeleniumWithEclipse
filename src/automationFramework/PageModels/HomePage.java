package automationFramework.PageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationFramework.Common.UICommon;


public class HomePage extends BasePage
{
	WebDriver d;
	public HomePage(WebDriver driver)  {
		
		super(driver);
		this.d = driver;
		
	}
	
	static //Search Criteria
	By MyAccount = By.xpath(".//*[@id='account']/a"); 	
	By AccountLockout = By.xpath(".//*[@id='account_logout']/a");
	
	
	public void ClickMyAccountButton()
	{
		UICommon.ClickElement(MyAccount, d);
	}
	
	

}
