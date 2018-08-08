package cases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.*;
import setup.TestConfiguration;
import setup.TestDriverFactory;
import utilities.CaptureScreenShot;
import utilities.Wait;

import java.io.IOException;

public abstract class BaseTest {
    ExtentHtmlReporter reporter;
    ExtentReports extent;
    ExtentTest logger;
    public  WebDriver driver;
    protected ContactUsPage contactUs;
    protected HomePage home;
    protected ServicesPage sevices;
    protected WorkPage work;
    protected AboutPage about;


    public void createDriver() {
        driver = new TestDriverFactory().createDriver();
    }

    public void destroyDriver() {
        driver.quit();
    }


    public void signIn()  {
        sevices = new ServicesPage(driver);
        home = new HomePage(driver);
        about = new AboutPage(driver);
        work = new WorkPage(driver);
        contactUs = new ContactUsPage(driver);
        home.get();
        driver.manage().window().maximize();
        Wait.wait5sec();
    }

    @BeforeMethod
    public void testSetup() {
        reporter = new ExtentHtmlReporter("./Reports/AutomationPractice.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        logger=extent.createTest("Valtech");
        extent.flush();
        createDriver();
        signIn();
    }

    @AfterMethod
    public void testTeardown(ITestResult result) throws IOException {
        if (result.getStatus()==ITestResult.FAILURE)
        {
            String temp = CaptureScreenShot.getScreenshot(driver);
            logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
        }
        extent.flush();
        destroyDriver();
    }

}
