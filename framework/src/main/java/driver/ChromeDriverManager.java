package driver;

import drivers.DriversData;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends  DriverManager {

    protected void createWebDriver() {
        System.setProperty(DriversData.DriversProperty.CHROME, DriversData.DriversPath.CHROME);

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }
}
