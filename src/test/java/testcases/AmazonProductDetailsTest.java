package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ama.qa.base.TestBase;
import com.ama.qa.pages.AmazonHomePage;
import com.ama.qa.pages.AmazonLoginPage;
import com.ama.qa.pages.AmazonProductDetailsPage;
import com.ama.qa.pages.ShoppingCartPage;


public class AmazonProductDetailsTest extends TestBase {

    AmazonProductDetailsPage amazonProductDetailsPage;
    AmazonHomePage amazonHomePage;
    ShoppingCartPage shoppingCartPage;
    AmazonLoginPage amazonLoginPage;

    @BeforeClass
    public void setup() {
        initialization(); 
        amazonProductDetailsPage = new AmazonProductDetailsPage();
        amazonHomePage = new AmazonHomePage();
        shoppingCartPage = new ShoppingCartPage();
        amazonLoginPage = new AmazonLoginPage();
    }

    @Test(priority = 1)
    public void verifyProductDetailsAndAddToCartFlow() throws InterruptedException {
      
        String expectedTitle = "Noise Twist Go Round dial Smartwatch";
        String expectedPrice = "1,399";

        String actualTitle = amazonProductDetailsPage.getSearchedProductTitle();
        String actualPrice = amazonProductDetailsPage.getSearchedProductPrice();

        Assert.assertTrue(actualTitle.contains(expectedTitle), "Product title mismatch.");
        Assert.assertEquals(actualPrice, expectedPrice, "Product price mismatch.");

        amazonProductDetailsPage.clickOnAddToCart();
        amazonProductDetailsPage.clickProceedToCheckoutFromSheet();
        amazonHomePage.clickOnCart();
        shoppingCartPage.clickProceedToBuy();

       

        System.out.println("Test completed successfully: Product added to cart and proceeded to buy.");
    }
}
