package driver;

import drivers.DriversData;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends  DriverManager {

    protected void createWebDriver() {
        WebDriverManager.chromedriver().version(DriversData.BrowserVersions.CHROME).setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }
}
