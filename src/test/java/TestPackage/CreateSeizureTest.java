package TestPackage;
import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AddSeizure;
import Pages.EditSeizure;
import Testbase.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Properties;

public class CreateSeizureTest extends TestBase {
	public AddSeizure  addseizure=new AddSeizure();
	public EditSeizure editseizure=new EditSeizure();
	public String Username;
	public String Password;
	public String Date;
	public String Time;
	public String Type;
	public String NewType;
	
	@BeforeTest
	
	public void initilaization() throws IOException
	{   
		
		
		Setup() ;
		getUrl();
		
		Username=prop.getProperty("Username");
		Password=prop.getProperty("Password");
		Date=prop.getProperty("Date");
		Time=prop.getProperty("Time");
		Type=prop.getProperty("Type");
		NewType=prop.getProperty("NewType");
		
	}
	
	
	
	
	@Test
	public void locators() throws InterruptedException, AWTException
	{
		
		addseizure.LoginApplication(Username,Password);
		addseizure.addSeizureDeatils(Date,Time, Type);
		editseizure.editSeizureDeatils(NewType);
		
	}
	
	
	@AfterTest
	public void deleteExistingSeizure() throws InterruptedException
	{
		
		editseizure.delete();
		driver.close();
		
	}
	
	
	
	
	

}
