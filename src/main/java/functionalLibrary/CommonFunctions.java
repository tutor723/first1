package functionalLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommonFunctions {
    public static WebDriver driver;
    public void openBrowser(){


            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
    public void closeBrowser(){
        driver.quit();
    }

public void waitForTime(int waittime){
        driver.manage().timeouts().implicitlyWait(waittime,TimeUnit.SECONDS);
}



}
