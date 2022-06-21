package Testbase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	

	
	public void Setup()
	{
	
	WebDriverManager.chromiumdriver().setup();
	driver= new ChromeDriver();
	
	}
	
	public void getUrl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	}

}
