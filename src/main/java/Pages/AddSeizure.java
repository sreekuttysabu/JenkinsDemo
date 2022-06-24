package Pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Testbase.TestBase;


public class AddSeizure extends  TestBase{
	

	public utils.WaitHelper waitHelper;
	
// Login 	
	  public WebElement navigateFirst() { 
		  
      return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[3]/div[2]/div")); 
      
	  }
	  
	  public WebElement Letsgo() { 
		  
	  return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div/div[2]/div[4]/div")); 
	      
	  }
	 
	  public WebElement ExistingAccount() { 
		  
		  return driver.findElement(By.xpath("//div[text()='I already have an account']")); 
		      
	  }
	
      public WebElement UserName() { 
		  
		  return driver.findElement(By.xpath("//input[@data-testid='Email']")); 
		      
	  }
	  
      public WebElement Password() { 
		  
		  return driver.findElement(By.xpath("//input[@data-testid='Password']")); 
		      
	  }
      
      public WebElement loginButton() { 
		  
		  return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div/div[3]")); 
		      
	  }
// Seizure details      
      
      
      public WebElement addSeizureButton() { 
		  
		  return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[1]/div/div[2]/div[5]/div")); 
		      
	  }
      
      public WebElement clickDatePicker() { 
		  
		  return driver.findElement(By.xpath("//input[@type=\"date\"]")); 
		      
	  }
     public WebElement TimeSet() { 
		  
		  return driver.findElement(By.xpath("//input[@type='time']")); 
		      
	  }
      
     public WebElement selectType() { 
		  
		  return driver.findElement(By.xpath("//div[text()='Select one option'][1]")); 
		      
	  }
    
     public WebElement getSeizureTYpe(String type) { 
		  
		  return driver.findElement(By.xpath("//div[text()='"+type+"']")); 
		      
	  }
     
     public WebElement validateType() { 
		  
		  return driver.findElement(By.xpath("//div[@data-testid=\"action_modal_btn\"]")); 
		      
	  }
   
     public WebElement feltComingNo() { 
		  
		  return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[6]/div[2]/div/div/div[2]/div[2]/div")); 
		      
	  }
     

public WebElement saveSeizureDetails() { 
	  
	 return driver.findElement(By.xpath("//div[@data-testid=\"save_event\"]"));  
	      
}

public WebElement close() { 
	  
	 return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[3]/div/div/div"));  
	      
}

public WebElement checkPlaceholder() { 
	  
	 return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]"));  
	      
}

// Login to the Application-Already existing user	
public void LoginApplication(String Username,String Password) throws InterruptedException
{
	waitHelper= new utils.WaitHelper();
	Thread.sleep(4000);
	waitHelper.VisibleForElement(this.navigateFirst(),5000);
	navigateFirst().click();
	waitHelper.VisibleForElement(this.Letsgo(),5000);
	Letsgo().click();
	waitHelper.VisibleForElement(this.ExistingAccount(),5000);
	ExistingAccount().click();
	waitHelper.VisibleForElement(this.UserName(),5000);
	UserName().sendKeys(Username);
	waitHelper.VisibleForElement(this.Password(),5000);
	Password().sendKeys(Password);
	waitHelper.VisibleForElement(this.loginButton(),5000);
	loginButton().click();
	
	
}
// Add Seizure details	
public void addSeizureDeatils(String Date,String Time,String Type) throws InterruptedException, AWTException
{
	waitHelper= new utils.WaitHelper();
	Thread.sleep(4000);
	waitHelper.VisibleForElement(this.addSeizureButton(),5000);
	addSeizureButton().click();
	selectDateAndTime(Date,Time);
	selectSeizureType(Type);
	feltItIsComing();
	waitHelper.VisibleForElement(this.saveSeizureDetails(),5000);
	saveSeizureDetails().click();
	Thread.sleep(3000);
	waitHelper.VisibleForElement(this.close(),5000);
	close().click();
	Assert.assertEquals(checkPlaceholder().getText(), Type);
	
	
}
	
// Date Picker

public void selectDateAndTime(String Date,String Time) throws InterruptedException
{
	waitHelper= new utils.WaitHelper();
	Thread.sleep(2000);
	waitHelper.VisibleForElement(this.clickDatePicker(),5000);
	clickDatePicker().click();
	clickDatePicker().sendKeys(Date);
	Thread.sleep(2000);
	waitHelper.VisibleForElement(this.TimeSet(),5000);
	TimeSet().click();
	TimeSet().sendKeys(Time);
}
// Select type	
   
public void selectSeizureType(String type) throws InterruptedException
{
	waitHelper= new utils.WaitHelper();
	Thread.sleep(3000);
	waitHelper.VisibleForElement(this.selectType(),5000);
	selectType().click();
	waitHelper.VisibleForElement(this.getSeizureTYpe(type),5000);
	getSeizureTYpe(type).click();
	waitHelper.VisibleForElement(this.validateType(),5000);
	validateType().click();
	
}
   
public void feltItIsComing() throws InterruptedException
{
	waitHelper= new utils.WaitHelper();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(400,document.body.scrollHeight)");
	Thread.sleep(3000); 
	waitHelper.VisibleForElement(this.feltComingNo(),5000);
	feltComingNo().click();
	 
}
  

 

}
