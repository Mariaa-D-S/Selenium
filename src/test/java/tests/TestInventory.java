package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

import java.time.Duration;

import static org.junit.Assert.*;

public class TestInventory {
    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        loginPage.login("standard_user","secret_sauce");
    }

    @Test
    public void addToCart(){
        inventoryPage.addToCart();
        assert driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed();
    }

    @Test
    public void cart(){
        inventoryPage.cartBtn();
        assertEquals("https://www.saucedemo.com/cart.html", driver.getCurrentUrl());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
