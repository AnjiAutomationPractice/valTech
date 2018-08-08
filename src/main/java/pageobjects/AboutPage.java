package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Wait;

//import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;


public class AboutPage extends BaseObject {

    public AboutPage(WebDriver driver) {super(driver);}

    private static By aboutPageText = By.xpath("//h3[contains(text(),'About')]");


    public String getAboutPageText() {
        waitForElementToBeVisible(aboutPageText);
        return getText(aboutPageText);
    }


}

