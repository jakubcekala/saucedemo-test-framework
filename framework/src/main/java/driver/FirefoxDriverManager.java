package driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager extends DriverManager{

    protected void createWebDriver() {
        FirefoxOptions options = new FirefoxOptions();
        //TODO Set browser options

        driver = new FirefoxDriver(options);
    }
}
