package driver;

import drivers.DriversData;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager extends DriverManager{

    protected void createWebDriver() {
        System.setProperty(DriversData.DriversProperty.FIREFOX, DriversData.DriversPath.FIREFOX);

        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
    }
}
