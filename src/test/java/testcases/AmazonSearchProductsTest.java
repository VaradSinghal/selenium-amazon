package testcases;

import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ama.qa.base.TestBase;
import com.ama.qa.pages.AmazonHomePage;
import com.ama.qa.pages.AmazonSearchProductsPage;
import com.ama.qa.pages.AmazonProductDetailsPage;




public class AmazonSearchProductsTest extends TestBase{

	AmazonSearchProductsPage amazonSearchProductsPage;
	AmazonHomePage amazonHomePage;
	AmazonProductDetailsPage amazonProductDetailsPage;


	@BeforeTest
	public void setup() throws InterruptedException {
		initialization();
		amazonSearchProductsPage = new AmazonSearchProductsPage();
		amazonHomePage =new AmazonHomePage();
	}




	@Test(priority=0)
	public void searchedProductPageOpened() throws InterruptedException {
	    amazonHomePage.selectCategory("Electronics");
	    Assert.assertEquals(amazonHomePage.getSelectedCategory(), "Electronics");

	    amazonHomePage.searchForProduct("female smartwatch");
	    amazonHomePage.clickOnSearchButton();

	    amazonSearchProductsPage.clickOnProduct("Noise Twist Go Round");


	    amazonProductDetailsPage = new AmazonProductDetailsPage();

	    Assert.assertTrue(amazonProductDetailsPage.getSearchedProductTitle().contains("Noise Twist"),
	            "Product title mismatch");
	}


	
	@Test(priority=1)
	public void clickOnRequiredProduct() throws InterruptedException
	{
       
		amazonSearchProductsPage.clickOnProduct("Noise Twist Go Round dial Smartwatch with BT Calling, 1.39\" Display, Metal Build, 100+ Watch Faces, IP68, Sleep Tracking, 100+ Sports Modes, 24/7 Heart Rate Monitoring (Rose Pink)");
	
		
	}
	
	
	
}
