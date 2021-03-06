package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import org.openqa.selenium.firefox.FirefoxDriver;

import automationFramework.Common.*;
import automationFramework.PageModels.HomePage;

public class FirstTestCase {

	
private static FirefoxDriver driver = null;

public static void main(String[] args) {

//Search Criteria
By MyAccount = By.xpath(".//*[@id='account']/a"); 	
By AccountLockout = By.xpath(".//*[@id='account_logout']/a");
	

//Create a new instance of the Firefox driver

driver = new FirefoxDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the Online Store Website

driver.get("http://www.store.demoqa.com");

        // Find the element that's ID attribute is 'account'(My Account) 

//driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//UICommon.GetElement(MyAccount, driver).click();
HomePage homepage = new HomePage(driver);
homepage.ClickMyAccountButton();

        // Find the element that's ID attribute is 'log' (Username)

        // Enter Username on the element found by above desc.

driver.findElement(By.id("log")).sendKeys("testuser_1"); 

        // Find the element that's ID attribute is 'pwd' (Password)

        // Enter Password on the element found by the above desc.

        driver.findElement(By.id("pwd")).sendKeys("Test@123");

        // Now submit the form. WebDriver will find the form for us from the element 

        driver.findElement(By.id("login")).click();

        // Print a Log In message to the screen

        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

        // Find the element that's ID attribute is 'account_logout' (Log Out)

        driver.findElement(AccountLockout).click();

        // Close the driver

        driver.quit();

            }

    }