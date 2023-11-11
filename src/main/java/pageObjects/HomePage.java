package pageObjects;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserFactory;
import utilities.WebDriverUtils;

public class HomePage extends BasePage
{

    public String headerText = "My Account";

    WebDriver driver;
    public HomePage(WebDriver driver){

        super(driver);
        this.driver = driver;
    }

    public void gotoLoginPage() throws Exception {
        driver = BrowserFactory.getDriver();
        WebDriverUtils.clickOnText(driver,"Login");
        driver.findElement(By.id("email")).sendKeys("sriram.angajala@bananaapps.co.uk");
        driver.findElement(By.id("password")).sendKeys("Krishh12$");
        WebDriverUtils.clickOnButton(driver,"Log in");
        WebDriverUtils.clickOnText(driver,"Leads");
        Thread.sleep(10000);
        WebDriverUtils.clickOnText(driver,"I don't want web notifications");
//        WebDriverUtils.clickOnSpan(driver,"Filter");
//        WebDriverUtils.clickOnButton(driver,"Services");
//        WebDriverUtils.clickOnButton(driver,"Mobile");
//        WebDriverUtils.clickOnButton(driver,"Apply");
        Thread.sleep(30000);
    }


    public boolean isUserInHomePage(WebDriver driver) {
        return WebDriverUtils.checkTextPresentOnPage(driver,headerText);
    }
}
