package genaric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class basetest implements Autoconstant
{
	static
	{
		System.setProperty(chromekey, chromevalue);
		System.setProperty(geckokey, geckovalue);
	}
	
	public WebDriver driver;
	@Parameters("browser")
	@BeforeMethod(alwaysRun=true)
	public void beforemethod(String browser)
	{
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
		else
			driver=new FirefoxDriver();
		
	//driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do;jsessionid=923ED7CBF27D127B00054DF7C1066EE9");
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void aftermethod(ITestResult res)
	{
		int status = res.getStatus();
		String name=res.getMethod().getMethodName();
		photo.getphoto(driver,name);
		driver.close();
	}
	

}
