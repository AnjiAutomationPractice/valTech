package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends BaseObject {

    public ContactUsPage(WebDriver driver) {super(driver);}

    public String expectedPageTitle = "Our offices | Valtech";
    public String expectedFoundedText = "Founded in 1993 Valtech now has 2,500+ people with diverse skill sets across 36 offices in 16 countries.";
    public String expectedAddress = "Valtech Buenos Aires\n" +
            "Palermo Hollywood\n" +
            "5958 Cabrera St.\n" +
            "Buenos Aires City\n" +
            "+54 11 6009 8282";
    private static By foundedText = By.xpath("//*[@id='valtech-wrapper']/div/main/vue/div/div[2]/div/div[1]/h3");
    private static By addressText = By.xpath(".//*[@id='Argentina']/div[2]/div[1]/div[1]/address");

    public String getFoundedText(){
        waitForElementToBeVisible(foundedText);
        return getElementText(foundedText);
    }
    public String getAddressText(){
        waitForElementToBeVisible(addressText);
        return getElementText(addressText);
    }
}


