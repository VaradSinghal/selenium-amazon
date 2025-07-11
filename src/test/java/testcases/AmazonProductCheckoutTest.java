package testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ama.qa.pages.AmazonProductCheckoutPage;


public class AmazonProductCheckoutTest {
	
	AmazonProductCheckoutPage amazonProductCheckoutPage;
	@BeforeSuite
	public void setup()
	{
		//initialization();
		amazonProductCheckoutPage=new AmazonProductCheckoutPage();
		
	}
	
	@Test(priority = 5)
	public void useAddress()
	{
		amazonProductCheckoutPage.clickShipToAddressButton();
	}
}
