package driver;

import drivers.DriversData;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class InternetExplorerDriverManager extends DriverManager {

    protected void createWebDriver() {
        WebDriverManager.iedriver().version(DriversData.BrowserVersions.INTERNET_EXPLORER).setup();
        InternetExplorerOptions options = new InternetExplorerOptions();
        driver = new InternetExplorerDriver(options);
    }
}
