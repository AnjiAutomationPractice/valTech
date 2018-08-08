package cases;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Wait;

public class ContactUsTest extends BaseTest {

    @Test
    public void ContactUsVerifyTest(){
        home.clickCookiesButton();
        Wait.wait5sec();
        home.clickMenuButton();
        Wait.wait1sec();
        home.clickContactUsLink();
        Assert.assertEquals(contactUs.getPageTitle(),contactUs.expectedPageTitle);
        Assert.assertEquals(contactUs.getFoundedText(), contactUs.expectedFoundedText);
        Assert.assertEquals(contactUs.getAddressText(), contactUs.expectedAddress);

    }
}
