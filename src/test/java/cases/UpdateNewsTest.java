package cases;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import setup.TestConfiguration;
import utilities.CaptureScreenShot;
import utilities.Wait;

public class UpdateNewsTest extends BaseTest{


    @BeforeMethod
    public void testSetup(){
        super.testSetup();
    }

    @Test
    public void homePageUpdatedWithTheLatestNewsTest(){
        Wait.wait5sec();
        home.clickCookiesButton();
        Wait.wait1sec();
        Assert.assertEquals(home.getPageTitle(),"Where Experiences are Engineered");

    }



}
