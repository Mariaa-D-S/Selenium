package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompleteActions {
    WebDriver driver;
    By backHomeButton = By.id("back-to-products");

    public CheckoutCompleteActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBackHome(){
        driver.findElement(backHomeButton).click();
    }
}
