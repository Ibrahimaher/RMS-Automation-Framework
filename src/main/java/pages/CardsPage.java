package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utiles.ElementUtils;

public class CardsPage {
    WebDriver driver;  // WebDriver instance for interacting with browser
    ElementUtils elementUtils = new ElementUtils(); // Utility class for element actions
    // Constructor: Initialize WebDriver
    public CardsPage(WebDriver driver) {
        this.driver = driver;
    }
    private By POSCard =By.xpath("//div[@class ='card-content']//h2[text()='P.O.S Module']");
    private By AdminCard=By.xpath("//div[@class ='card-content']//h2[text()='Authentication']");


    public void clickPOSCard() {
           elementUtils.click(POSCard);
    }
    public void clickAdminCard() {
        elementUtils.click(AdminCard);
    }




}
