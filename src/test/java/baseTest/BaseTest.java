package baseTest;

import java.io.ByteArrayInputStream;

import utiles.BrowserUtils;
import utiles.DriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utiles.ElementUtils;


public class BaseTest {
    WebDriver driver;
    private BrowserUtils browser;
    private ElementUtils elementUtils;
    private DriverManager driverManager;

    // Before class: Initialize browser driver
    @BeforeClass
    public void SetupClass() {
        driverManager = new DriverManager();
        driverManager.initializeBrowser();
        System.out.println("Setup done TC01");
    }

    // After class: Close browser
    @AfterClass
    public void TearDownClass() {
        driverManager.closeBrowser();
        System.out.println("TearDown done TC01");
    }

    // Before each test method: Initialize page objects and browser utils
    @BeforeMethod
    public void SetupMethod() {
        browser = new BrowserUtils();
        elementUtils = new ElementUtils();
        System.out.println("Setup method done TC01");
    }

    // After each test: Capture screenshot if test fails and attach to Allure report
    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment(
                    "Screenshot: " + result.getName(),
                    new ByteArrayInputStream(screenshotBytes)
            );
        }
    }
}

