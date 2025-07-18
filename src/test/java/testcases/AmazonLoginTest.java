package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ama.qa.base.TestBase;
import com.ama.qa.pages.AmazonHomePage;
import com.ama.qa.pages.AmazonLoginPage;
import com.ama.qa.pages.AmazonProductDetailsPage;
import com.ama.qa.pages.ShoppingCartPage;
import com.ama.qa.util.ConfigReader;


public class AmazonLoginTest extends TestBase {
	
	ConfigReader configReader=new ConfigReader();	
	AmazonLoginPage amazonLoginPage;
		
	@BeforeTest
	public void setup()
	{
		amazonLoginPage=new AmazonLoginPage();

	} 
	@Test(priority = 4)
	public void amazonLogin()
	{
		
		amazonLoginPage.enterEmailOrPhone(configReader.getUsername());
		amazonLoginPage.clickContinue();
		amazonLoginPage.enterPassword(configReader.getPassword());
		amazonLoginPage.clickSignIn();
		
	}
	
	
}
