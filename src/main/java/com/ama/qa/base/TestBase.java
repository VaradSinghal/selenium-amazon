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

 class TestBase {

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
	    String browsername = prop.getProperty("BROWSER").toLowerCase(); // get from config
	    String url = prop.getProperty("URL"); // get URL from config

	    if (browsername.equals("chrome")) {
	        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
	        driver = new ChromeDriver();

	    } else if (browsername.equals("edge")) {
	        System.setProperty("webdriver.edge.driver", "C:\\WebDrivers\\msedgedriver.exe");
	        driver = new EdgeDriver();

	    } else if (browsername.equals("firefox")) {
	        System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
	        driver = new FirefoxDriver();

	    } else {
	        throw new RuntimeException("Browser not supported: " + browsername);
	    }

	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(url);
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

