package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ServicesPage extends BaseObject {
    public ServicesPage(WebDriver driver) {super(driver);}
    private static By servicesPageText = By.xpath("//h3[contains(text(),'Services')]");


    public String getServicesPageText() {
        waitForElementToBeVisible(servicesPageText);
        return getText(servicesPageText);
    }




}
