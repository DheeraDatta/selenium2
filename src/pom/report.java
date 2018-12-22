package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaric.basepage;

public class report extends basepage
{
	@FindBy(id="logoutLink")
	private WebElement logout;
	@FindBy(xpath="//a[contains(@class,'content reports')]")
	private WebElement report;
	
	public report(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clicklogout()
	{
		this.elementvisibility(this.logout);
		this.logout.click();
	}
	public void clickusers()
	{
		this.elementvisibility(this.report);
		this.report.click();
	}
	}


