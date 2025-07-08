package com.ama.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/* 
* Author Information:
* Author: Sonal Garg 
* LinkedIn: https://www.linkedin.com/in/sonalgarg32/
* 
* @version 1.0
* @since 2024-09-22
*/
public class TestBase {

	public static WebDriver driver = null;
	public static Properties prop;
	// public static EventFiringWebDriver e_driver;
	// public static WebEventListener eventListener;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Varad Singhal\\eclipse-workspace\\AmazonSelenium\\src\\main\\java\\com\\ama\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//String browsername = prop.getProperty("browser");
		
	}

	public static void initialization() {
		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.edge.driver", "C:\\\\WebDrivers\\\\msedgedriver.exe");
			driver = getdriver();

		}
	
		driver.get("https://www.facebook.com/");
	}

	/*public static void myWait()
	{
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(2000));
		//wait.until(ExpectedConditions.element))
	}
	*/
	public static final WebDriver getdriver(){
	    if (driver == null){
	    	
	  
	      driver = new EdgeDriver();
	      return driver;
	    }else{
	      return driver;
	    }
	  }
	
	
}

