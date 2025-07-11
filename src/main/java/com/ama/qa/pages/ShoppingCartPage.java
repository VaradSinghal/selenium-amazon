package com.ama.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ama.qa.base.TestBase;


public class ShoppingCartPage extends TestBase {

	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")WebElement proceedToBuy;
	
	public ShoppingCartPage(){
			PageFactory.initElements(getdriver(), this);
		}
	 
	@Test(priority = 3)
	public void clickProceedToBuy() {
	    WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(10));
	    WebElement button = wait.until(ExpectedConditions.elementToBeClickable(proceedToBuy));
	    ((JavascriptExecutor) getdriver()).executeScript("arguments[0].scrollIntoView(true);", button);
	    ((JavascriptExecutor) getdriver()).executeScript("arguments[0].click();", button);
	}

	
	
}
