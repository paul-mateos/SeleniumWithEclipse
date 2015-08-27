package automationFramework.TestCases;



import java.util.concurrent.TimeUnit;
import org.junit.Test;
import automationFramework.PageModels.*;

public class LoginInTest extends BaseTest 

{

	@Test
	public void LoginTest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        
		HomePage homepage = new HomePage(driver);
		homepage.ClickMyAccountButton();
	}

}
