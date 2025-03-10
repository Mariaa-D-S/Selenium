package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginActions {
    WebDriver driver;
    By loginButton = By.id("login-button");

    public LoginActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
