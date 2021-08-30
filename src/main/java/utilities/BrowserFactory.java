package utilities;

import config.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserFactory
{

    private static final String AWS_URL = "http://18.221.144.225:4444/";
   /* static WebDriver driver;
    //Invoke Browser - Local/Browserstack/Docker/AWS/HEadless

    public static WebDriver invokeBrowser(String targetDevice){
        return null;

    }
    public static WebDriver getDriver(){
        return driver;
    }

    public static boolean validateBrowserStackcredentials(String username, String password){
        return false;


    }

    */


    static WebDriver driver;

    public static WebDriver getDriver() {


        if(driver==null){

            {

                WebDriverManager.chromedriver().setup();

                driver = new ChromeDriver();

//                Capabilities capabilities = DesiredCapabilities.chrome();
//
//                try {
//                    driver = new RemoteWebDriver(new URL(AWS_URL),capabilities);
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                }
            }


            driver.get(Constants.BASE_URL);
        }

        return  driver;
    }
    public static  void stopDriver(){
        driver.quit();
        driver = null;
    }
}
