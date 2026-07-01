package tests;

import baseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import utiles.BrowserUtils;
import utiles.DriverManager;
import org.testng.annotations.*;
import static org.testng.Assert.*;


public class validLogin extends BaseTest {

    @Test
    public void validLogin()
    {

        browser.navigateToURL("http://10.10.10.182:4000/sign-in");
        assertEquals(loginPage.getHeaderText(),"Sign in");
        loginPage.enterUsername("SuperAdmin");
        loginPage.enterPassword("123456");
        loginPage.clickLoginButton();
        cardsPage.clickPOSCard();
    }
}


