package MyTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testbase.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UsernameTest extends TestBase {
	
	public WebElement username()
	{
		return driver.findElement(By.id("frmLogin"));
		
		
	}
	
	
	@BeforeTest
	
	public void initilaization()
	{
		System.out.println("sandeep");
		Setup();
		getUrl();
	}
	
	
	
	
	@Test
	public void locators()
	{
		System.out.println("sandeep");
		username().click();
		
		//driver.quit();
		
	}
	
	
	
	
	
	
	
	

}
