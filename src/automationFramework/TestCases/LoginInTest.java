package automationFramework.TestCases;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;

import automationFramework.Common.UICommon;
import automationFramework.PageModels.*;

public class LoginInTest extends BaseTest 

{

	//Search Criteria
	//By MyAccount = By.xpath(".//*[@id='account']/a"); 	
	//By AccountLockout = By.xpath(".//*[@id='account_logout']/a");
	
	@Test
	public void LoginTest() {

        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage homepage = new HomePage(driver);
		homepage.ClickMyAccountButton();
	}

}
