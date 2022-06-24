package Pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Testbase.TestBase;


public class EditSeizure extends  TestBase{
	

	public utils.WaitHelper waitHelper;
	
// Login 	
	  public WebElement selectSeizure() { 
		  
      return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div[5]/div[1]/div")); 
      
	  }
	  
	  
	  public WebElement chooseSeizure() { 
		  
	      return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[24]/div/div[2]/div[3]/div/div[2]")); 
	      
		  }
	  
 public WebElement selectType() { 
		  
		  return driver.findElement(By.xpath("//div[text()='Select one option'][1]")); 
		      
	  }
 
 public WebElement selectTypeEdit() { 
	  
	  return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[5]/div[2]/div/div")); 
	      
 }
 
 public WebElement selectTypeDelete() { 
	  
	  return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div[5]/div[1]/div")); 
	      
}

 

 
 public WebElement getSeizureTYpe(String type) { 
	  
	  return driver.findElement(By.xpath("//div[text()='"+type+"']")); 
	      
 }
 public WebElement getSeizureTYpeEdit(String Newtype) { 
	  
	  return driver.findElement(By.xpath("//div[text()='"+Newtype+"']")); 
	      
}

public WebElement validateType() { 
	  
	  return driver.findElement(By.xpath("//div[@data-testid=\"action_modal_btn\"]")); 
	      
 }


public WebElement EditSave() { 
	  
	  return driver.findElement(By.xpath("//*[@data-testid=\"save_event\"]")); 
	      
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



public WebElement Home() { 
	  
	 return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/a[1]/div/div[2]"));  
	      
}






public WebElement deleteSEizure() { 
	  
	 return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[2]/div[1]"));  
	      
}

public WebElement deleteConfirm() { 
	  
	 return driver.findElement(By.xpath("//div[text()='Confirm']"));  
	      
}

public WebElement selectTODelete() { 
	  
	 return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[24]/div/div[2]/div[3]/div/div[2]/div/div/div[3]"));  
	      
}




// Add Seizure details	
public void editSeizureDeatils(String NewType) throws InterruptedException, AWTException
{
	waitHelper= new utils.WaitHelper();
	Thread.sleep(4000);
	waitHelper.VisibleForElement(this.selectSeizure(),5000);
	selectSeizure().click();
	
	Thread.sleep(3000);
	waitHelper.VisibleForElement(this.chooseSeizure(),5000);
	chooseSeizure().click();
	
	
	selectSeizureType(NewType);
	
	waitHelper.VisibleForElement(this.Home(),5000);
	Thread.sleep(3000);
	Home().click();
	
	Thread.sleep(3000);
	waitHelper.VisibleForElement(this.checkPlaceholder(),5000);
	Assert.assertEquals(checkPlaceholder().getText(), NewType);
	
	
	
	
}
public void selectSeizureType(String type) throws InterruptedException
{
	waitHelper= new utils.WaitHelper();
	Thread.sleep(3000);
	waitHelper.VisibleForElement(this.selectTypeEdit(),5000);
	selectTypeEdit().click();
	waitHelper.VisibleForElement(this.getSeizureTYpeEdit(type),5000);
	getSeizureTYpeEdit(type).click();
	waitHelper.VisibleForElement(this.getSeizureTYpeEdit(type),5000);
	getSeizureTYpeEdit(type).click();
	waitHelper.VisibleForElement(this.validateType(),5000);
	validateType().click();
	waitHelper.VisibleForElement(this.EditSave(),5000);
	EditSave().click();
	
}
 


public void delete()
		throws InterruptedException
{
	waitHelper= new utils.WaitHelper();
	Thread.sleep(3000);
	waitHelper.VisibleForElement(this.selectTypeDelete(),5000);
	selectTypeDelete().click();
	
	Thread.sleep(3000);
	waitHelper.VisibleForElement(this.selectTODelete(),5000);
	selectTODelete().click();
	
	Thread.sleep(2000);
	waitHelper.VisibleForElement(this.deleteSEizure(),5000);
	deleteSEizure().click();
	
	Thread.sleep(3000);
	waitHelper.VisibleForElement(this.deleteConfirm(),5000);
	deleteConfirm().click();
	Thread.sleep(4000);
	
}






}
