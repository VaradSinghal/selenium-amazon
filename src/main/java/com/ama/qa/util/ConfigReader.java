package com.ama.qa.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {
	private String username = "";
	private String password = "";
	private String browser ="";

	public ConfigReader() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\Varad Singhal\\eclipse-workspace\\AmazonSelenium\\src\\main\\java\\com\\ama\\qa\\config\\config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Cant't read config.properties file!");
			return;
		}
		Properties p = new Properties();
		try {
			p.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Cant't read config.properties file!");
			return;
		}
		username = p.getProperty("USERNAME");
		password = p.getProperty("PASSWORD");
		browser = p.getProperty("BROWSER");
		
	}


	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}
	
	public String getBrowser() {
		return browser;
	}
}