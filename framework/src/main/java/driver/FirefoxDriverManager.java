package driver;

import drivers.DriversData;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager extends DriverManager{

    protected void createWebDriver() {
        WebDriverManager.firefoxdriver().version(DriversData.BrowserVersions.FIREFOX).setup();
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
    }
}
