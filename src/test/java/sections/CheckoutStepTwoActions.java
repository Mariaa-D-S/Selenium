package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepTwoActions {
    WebDriver driver;
    By cancelButton = By.id("cancel");
    By finishButton = By.id("finish");

    public CheckoutStepTwoActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCancel(){
        driver.findElement(cancelButton).click();
    }

    public void clickFinish(){
        driver.findElement(finishButton).click();
    }
}
