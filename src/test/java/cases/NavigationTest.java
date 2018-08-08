package cases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Wait;

public class NavigationTest extends BaseTest{
    @BeforeMethod
    public void testSetup(){
        super.testSetup();
    }

    @Test
    public void CorrectPageLoadedTest(){
        home.clickCookiesButton();
        Wait.wait5sec();
        home.clickMenuButton();
        Wait.wait1sec();
        home.clickWorkLink();
        Assert.assertEquals(work.getWorkPageText(),"Work");
        home.clickServicesLink();
        Assert.assertEquals(sevices.getServicesPageText(), "Services");
        home.clickAboutLink();
        Assert.assertEquals(about.getAboutPageText(), "About");

    }
}
