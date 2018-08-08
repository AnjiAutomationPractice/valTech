package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setup.TestConfiguration;
import utilities.Wait;

public class WorkPage extends BaseObject {

    public WorkPage(WebDriver driver) {
        super(driver);
    }

    private static By workPageText = By.xpath("//h3[contains(text(),'Work')]");


    public String getWorkPageText() {
        waitForElementToBeVisible(workPageText);
        return getText(workPageText);
    }


}
