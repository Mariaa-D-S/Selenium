package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartActions {
    WebDriver driver;
    By shoppingCartRemoveButton = By.id("remove-sauce-labs-backpack");
    By itemLink = By.id("item_4_title_link");
    By continueShoppingBtn = By.id("continue-shopping");
    By checkoutButton = By.id("checkout");

    public CartActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRemoveButton(){driver.findElement(shoppingCartRemoveButton).click();}
    public void clickContinueShoppingButton(){driver.findElement(continueShoppingBtn).click();}
    public void clickCheckoutButton(){driver.findElement(checkoutButton).click();}

    public void checkItemVisibility(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(itemLink));
    }
}
