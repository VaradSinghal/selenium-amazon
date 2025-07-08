package com.ama.qa.base;

import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {
	public static void main (String args[]) {
		System.setProperty("webdriver.edge.driver", "C:\\WebDrivers\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}
	
}
