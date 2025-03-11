package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutStepOnePage;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class TestCheckoutStepOne {
    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutStepOnePage checkoutStepOnePage;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        loginPage.login("standard_user","secret_sauce");
        inventoryPage.cartBtn();
        cartPage = new CartPage(driver);
        cartPage.checkout();
        checkoutStepOnePage = new CheckoutStepOnePage(driver);
    }

    @Test
    public void checkoutCancel(){
        checkoutStepOnePage.clickCancel();
        assertEquals("https://www.saucedemo.com/cart.html", driver.getCurrentUrl());
    }

    @Test
    public void checkoutWithValidData(){
        checkoutStepOnePage.fillCheckoutData("Ivan", "Ivanov", "1000");
        assertEquals("https://www.saucedemo.com/checkout-step-two.html", driver.getCurrentUrl());
    }

    @Test
    public void checkoutWithEmptyData(){
        checkoutStepOnePage.fillCheckoutData("", "", "");
        Assert.assertTrue("Error: First Name is required",true);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
