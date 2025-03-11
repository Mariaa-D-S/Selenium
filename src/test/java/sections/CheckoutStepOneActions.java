package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepOneActions {
    WebDriver driver;
    By cancelButton = By.id("cancel");
    By continueButton = By.id("continue");

    public CheckoutStepOneActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCancelButton(){driver.findElement(cancelButton).click();}

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
}
