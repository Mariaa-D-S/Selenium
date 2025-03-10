package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginDetails {
    private final WebDriverWait wait;

    private final By username = By.id("user-name");
    private final By password = By.id("password");

    public LoginDetails(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterUsername(String usernameVal) {
        WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        userField.sendKeys(usernameVal);
    }

    public void enterPassword(String passwordVal) {
        WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        passField.sendKeys(passwordVal);
    }
}
