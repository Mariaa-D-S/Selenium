package pages;

import org.openqa.selenium.WebDriver;
import sections.CheckoutStepTwoActions;

public class CheckoutStepTwoPage {
    WebDriver driver;
    CheckoutStepTwoActions checkoutStepTwoActions;

    public CheckoutStepTwoPage(WebDriver driver) {
        this.driver = driver;
        checkoutStepTwoActions = new CheckoutStepTwoActions(this.driver);
    }

    public void cancel(){
        checkoutStepTwoActions.clickCancel();
    }

    public void finishCheckout(){
        checkoutStepTwoActions.clickFinish();
    }
}
