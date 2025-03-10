package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class TestCart {
    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        loginPage.login("standard_user","secret_sauce");
        cartPage = new CartPage(driver);
    }

    @Test
    public void removeBtnInCart(){
        inventoryPage.addToCart();
        inventoryPage.cartBtn();
        assert driver.findElement(By.id("item_4_title_link")).isEnabled();
        cartPage.removeBtn();
        cartPage.checkVisibility();
    }

    @Test
    public void continueShopping(){
        inventoryPage.cartBtn();
        cartPage.continueShopping();
        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

    @Test
    public void checkout(){
        inventoryPage.addToCart();
        inventoryPage.cartBtn();
        cartPage.checkout();
        assertEquals("https://www.saucedemo.com/checkout-step-one.html", driver.getCurrentUrl());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
