package pages;

import org.openqa.selenium.WebDriver;
import sections.InventoryActions;

public class InventoryPage {
    WebDriver driver;
    InventoryActions inventoryActions;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.inventoryActions = new InventoryActions(this.driver);
    }

    public void addToCart(){
        inventoryActions.clickAddToCartButton();
    }

    public void cartBtn(){
        inventoryActions.clickShoppingCartBtn();
    }

//    public void removeBtn(){
//        inventoryActions.clickRemoveButton();
//    }
//
//    public void checkVisibility(){
//        inventoryActions.checkItemVisibility();
//    }
}
