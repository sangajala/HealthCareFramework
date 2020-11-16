package stepDefs;

import config.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserFactory;

public class StepDefinitions {

    static WebDriver driver;

    public void getDriver() {
        BrowserFactory.getDriver();
    }
    public void stopDriver(){
       BrowserFactory.stopDriver();
    }
}
