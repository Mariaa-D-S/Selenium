package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import static org.junit.Assert.assertEquals;

public class TestCheckoutStepTwo {
    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutStepOnePage checkoutStepOnePage;
    CheckoutStepTwoPage checkoutStepTwoPage;
    CompletedCheckoutPage completedCheckoutPage;

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
        checkoutStepOnePage.fillCheckoutData("Ivan", "Ivanov", "1000");
        checkoutStepTwoPage = new CheckoutStepTwoPage(driver);
    }

    @Test
    public void checkoutStepTwoCancel(){
        checkoutStepTwoPage.cancel();
        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

    @Test
    public void checkoutFinish(){
        assert driver.findElement(By.className("summary_info_label")).isDisplayed();
        checkoutStepTwoPage.finishCheckout();
        assertEquals("https://www.saucedemo.com/checkout-complete.html", driver.getCurrentUrl());
    }

    @Test
    public void backHome(){
        checkoutStepTwoPage.finishCheckout();
        assertEquals("https://www.saucedemo.com/checkout-complete.html", driver.getCurrentUrl());
        assert driver.findElement(By.className("complete-header")).isDisplayed();
        completedCheckoutPage = new CompletedCheckoutPage(driver);
        completedCheckoutPage.backHome();
        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
