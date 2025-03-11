package pages;

import org.openqa.selenium.WebDriver;
import sections.CheckoutCompleteActions;

public class CompletedCheckoutPage {
    WebDriver driver;
    CheckoutCompleteActions checkoutCompleteActions;

    public CompletedCheckoutPage(WebDriver driver) {
        this.driver = driver;
        checkoutCompleteActions = new CheckoutCompleteActions(this.driver);
    }

    public void backHome(){
        checkoutCompleteActions.clickBackHome();
    }
}
