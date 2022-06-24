package utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import Testbase.TestBase;

public class WaitHelper extends TestBase {

	

	public WaitHelper() {

	}

	public void WaitForElement(WebElement element, int i) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(i));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	
	public void VisibleForElement(WebElement element, int i) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}

	public void WaitForClickable(WebElement element, int i ) {
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}

}
