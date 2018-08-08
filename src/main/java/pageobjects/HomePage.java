package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setup.TestConfiguration;
import utilities.Wait;



public class HomePage extends BaseObject {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static By newsUpdateText = By.xpath("//*[@id='valtech-wrapper']/div/main/div[3]/div[1]/div[2]/div[1]/div/div[1]/div[4]/div[1]/p");
    private static By workLink = By.xpath("//button[contains(text(),'Work')]");
    private static By servicesLink = By.xpath("//button[contains(text(),'Services')]");
    private static By aboutLink = By.xpath("//button[contains(text(),'About')]");
    private static By contactUsLink = By.linkText("Contact Us");
    private static By menuButton = By.xpath("//div[@class='site-nav__icons']//button[@type='button']");
    private static By cookiesButton = By.id("CybotCookiebotDialogBodyButtonAccept");


    public void get() {
        getURL(TestConfiguration.applicationURL);
    }

    public void clickCookiesButton(){
        waitForElementToBeVisible(cookiesButton);
        click(cookiesButton);
    }
    public String getNewsUpdateText(){
        waitForElementToBeVisible(newsUpdateText);
        return getText(newsUpdateText);
    }

    public void clickWorkLink() {
        waitForElementToBeClickable(workLink);
        click(workLink);
    }

    public void clickServicesLink() {
        waitForElementToBeClickable(servicesLink);
        click(servicesLink);
    }

    public void clickAboutLink() {
        waitForElementToBeClickable(aboutLink);
        click(aboutLink);
    }

    public void clickContactUsLink() {
        waitForElementToBeClickable(contactUsLink);
        click(contactUsLink);
    }

    public void clickMenuButton() {
        waitForElementToBeClickable(menuButton);
        click(menuButton);
    }



}


