package automationFramework.UICommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UICommon {


	public static WebElement GetElement(By searchBy, WebDriver d)
	{
	WebElement elem = d.findElement(searchBy);
	return elem;
	}

}
