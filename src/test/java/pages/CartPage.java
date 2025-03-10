package pages;

import org.openqa.selenium.WebDriver;
import sections.CartActions;

public class CartPage {
    WebDriver driver;
    CartActions cartActions;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.cartActions = new CartActions(this.driver);
    }

    public void removeBtn(){
        cartActions.clickRemoveButton();
    }

    public void checkVisibility(){
        cartActions.checkItemVisibility();
    }

    public void continueShopping(){
        cartActions.clickContinueShoppingButton();
    }
    public void checkout(){
        cartActions.clickCheckoutButton();
    }
}
