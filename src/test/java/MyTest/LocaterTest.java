package MyTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testbase.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocaterTest extends TestBase {
	
	public WebElement username()
	{
		return driver.findElement(By.id("btnLogin"));
		
		
	}
	
	
	@BeforeTest
	
	public void initilaization()
	{
		System.out.println("sreekutty");
		Setup();
		getUrl();
	}
	
	
	
	
	@Test
	public void locators()
	{
		System.out.println("sree");
		username().click();
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	

}
