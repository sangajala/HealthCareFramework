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

            if(!Constants.REMOTE_VM.equals("")){

                if(Constants.REMOTE_VM.equals("LOCAL")){

                    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//"+"chromedriver");
                    Capabilities capabilities = DesiredCapabilities.chrome();


                    try {
                        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }

                }
            }
            else {

                WebDriverManager.chromedriver().setup();

                driver = new ChromeDriver();
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
