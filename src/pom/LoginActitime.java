package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaric.basepage;

public class LoginActitime extends basepage 
{
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	public LoginActitime(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}
	public void setpassword(String pw)
	{
		this.password.sendKeys(pw);
	}
	public void clicklogin()
	{
		this.loginbutton.click();
	}

}
