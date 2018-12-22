package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaric.basepage;

public class setting extends basepage
{	
	@FindBy(xpath="//div[contains(@class,'popup_menu_button popup_menu_button_settings')]")
	private WebElement settings;
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public setting(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clicklogout()
	{
		this.elementvisibility(this.logout);
		this.logout.click();
	}

	public void clicksettings()
	{
		this.settings.click();
	}
	
	

}
