package driver;

import drivers.DriversData;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class InternetExplorerDriverManager extends DriverManager {

    protected void createWebDriver() {
        System.setProperty(DriversData.DriversProperty.INTERNET_EXPLORER, DriversData.DriversPath.INTERNET_EXPLORER);

        InternetExplorerOptions options = new InternetExplorerOptions();
        driver = new InternetExplorerDriver(options);
    }
}
