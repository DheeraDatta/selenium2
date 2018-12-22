package genaric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class basepage 
{
	public WebDriver driver;
	public basepage(WebDriver driver2) 
	{
		this.driver=driver2;
	}
	public void titlewait(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log("title is matching", true);
		}
		catch(Exception e)
		{
			Reporter.log("title is not matching", true);
			Assert.fail();
		}
	
	}
	public void elementvisibility(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is visible", true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not visible", true);
			Assert.fail();
		}
	
	}
	

}
