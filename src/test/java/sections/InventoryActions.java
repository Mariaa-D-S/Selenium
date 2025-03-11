package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryActions {
    WebDriver driver;
    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCartButton = By.id("shopping_cart_container");

    public InventoryActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
    }

    public void clickShoppingCartBtn(){
        driver.findElement(shoppingCartButton).click();
    }

}
