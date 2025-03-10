package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryActions {
    WebDriver driver;
    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCartButton = By.id("shopping_cart_container");
    By shoppingCartRemoveButton = By.id("remove-sauce-labs-backpack");
    By itemLink = By.id("item_4_title_link");

    public InventoryActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
    }

    public void clickShoppingCartBtn(){
        driver.findElement(shoppingCartButton).click();
    }

//    public void clickRemoveButton(){driver.findElement(shoppingCartRemoveButton).click();}
//
//    public void checkItemVisibility(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(itemLink));
//    }
}
