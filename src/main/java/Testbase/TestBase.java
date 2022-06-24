package Testbase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop = new Properties();

	
	public void Setup() throws IOException
	{
	loadProperties();
	WebDriverManager.chromiumdriver().setup();
	driver= new ChromeDriver();
	
	}
	
	public void getUrl() throws IOException
	{
		
		
		
		driver.get("https://dq09byyrr73nc.cloudfront.net/Welcome");
		driver.manage().window().maximize();
		
	}

	
	
	public void loadProperties() throws IOException
	{
System.out.println();		
FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java" + "/Properties/Properties.properties");
prop.load(ip);
System.out.println("New"+prop.getProperty("Username"));
	}
}
