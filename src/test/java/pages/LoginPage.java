package pages;

import org.openqa.selenium.WebDriver;
import sections.LoginActions;
import sections.LoginDetails;

public class LoginPage {
    private final WebDriver driver;
    private final LoginDetails loginDetails;
    private final LoginActions loginActions;

    public LoginPage(WebDriver driver) {
        this.driver = driver; // Use the existing driver
        this.loginDetails = new LoginDetails(this.driver);
        this.loginActions = new LoginActions(this.driver);
    }

    public void login(String usernameVal, String passwordVal) {
        driver.get("https://www.saucedemo.com/");
        loginDetails.enterUsername(usernameVal);
        loginDetails.enterPassword(passwordVal);
        loginActions.clickLoginButton();
    }
}

