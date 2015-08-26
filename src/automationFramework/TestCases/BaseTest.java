package automationFramework.TestCases;

import static org.junit.Assert.*;

import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

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
		
	}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		driver.close();
	}


}
