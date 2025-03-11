package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutDetails {
    private final WebDriverWait wait;
    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By postalCode = By.id("postal-code");

    public CheckoutDetails(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterFirstName(String firstNameVal) {
        WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
        userField.sendKeys(firstNameVal);
    }

    public void enterLastName(String lastNameVal) {
        WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(lastName));
        userField.sendKeys(lastNameVal);
    }

    public void enterPostalCode(String postalCodeVal) {
        WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(postalCode));
        userField.sendKeys(postalCodeVal);
    }
}
