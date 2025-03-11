package pages;

import org.openqa.selenium.WebDriver;
import sections.CheckoutDetails;
import sections.CheckoutStepOneActions;

public class CheckoutStepOnePage {
    WebDriver driver;
    CheckoutStepOneActions checkoutStepOneActions;
    CheckoutDetails checkoutDetails;

    public CheckoutStepOnePage(WebDriver driver) {
        this.driver = driver;
        this.checkoutStepOneActions = new CheckoutStepOneActions(this.driver);
        this.checkoutDetails = new CheckoutDetails(this.driver);
    }

    public void clickCancel(){
        checkoutStepOneActions.clickCancelButton();
    }

    public void fillCheckoutData(String firstName, String lastName, String postalCode){
        checkoutDetails.enterFirstName(firstName);
        checkoutDetails.enterLastName(lastName);
        checkoutDetails.enterPostalCode(postalCode);
        checkoutStepOneActions.clickContinueButton();
    }
}
