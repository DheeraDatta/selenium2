package script;

import org.testng.annotations.Test;

import genaric.basetest;
import genaric.input;
import pom.LoginActitime;
import pom.Time_Track;
import pom.report;
import pom.setting;

public class script1 extends basetest 
{
	@Test
	public void test123() 
	{
		LoginActitime ob1 = new LoginActitime(driver);
		ob1.setusername(input.getdata(ExcelPath, "sheet1", 0, 1));
		ob1.setpassword(input.getdata(ExcelPath, "sheet1", 1, 1));
		ob1.clicklogin();
		ob1.titlewait("actiTIME - Enter Time-Track");
		//ob1.titlwait("jbjn");
		
		//Time_Track ob11=new Time_Track(driver);
		//ob11.clickusers();
		//ob11.clicklogout();
		
		report ob3=new report(driver);
		ob3.clickusers();
		ob3.clicklogout();
		
		//setting ob2=new setting(driver);
		//ob2.clicksettings();
		//ob2.clicklogout();
	    
	}

}
