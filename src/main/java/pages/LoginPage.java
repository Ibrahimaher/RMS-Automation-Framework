package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utiles.ElementUtils;

public class LoginPage {
    WebDriver driver;  // WebDriver instance for interacting with browser
    ElementUtils elementUtils = new ElementUtils(); // Utility class for element actions

    // Constructor: Initialize WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By Header = By.xpath("//h2[contains(text(),'Sign in')]");
    private final By usernameField = By.cssSelector("input[formcontrolname='username']");
    private final By passwordField = By.cssSelector("input[type='password']");
    private final By loginButton = By.cssSelector("button[type='submit']");

    public String getHeaderText()
    {
        return elementUtils.getText(Header);
    }
    public void enterUsername(String username) {
        elementUtils.sendKeys(usernameField, username);
    }
    public void enterPassword(String password) {
        elementUtils.sendKeys(passwordField, password);
    }
    public void clickLoginButton() {
        elementUtils.click(loginButton);
    }

}
