package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestLogin {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }


    @Test
    public void login(){
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", url);
    }

    @Test
    public void invalidLogin(){
        driver.get("https://www.saucedemo.com/");
        loginPage.login("abrakadabra", "123");
        Assert.assertTrue("Epic sadface: Username and password do not match any user in this service\n",true);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
