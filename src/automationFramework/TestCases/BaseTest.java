package automationFramework.TestCases;




import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.junit.AfterClass;
import org.junit.BeforeClass;


public class BaseTest {

	
	
	protected static WebDriver driver;
	
	public static void setDriver(WebDriver d)
	{
		driver = d;
		
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		//Properties properties = new Properties();
		String Browser = "FireFox";
		
		switch(Browser)
		{
			case "Chrome":
				setDriver( new ChromeDriver());
				break;
			case "FireFox":
				setDriver( new FirefoxDriver());
			break;
			default:
				break;				
		}
		
		//Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");

		}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		driver.close();
	}


}
