package driver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class InternetExplorerDriverManager extends DriverManager {

    protected void createWebDriver() {
        InternetExplorerOptions options = new InternetExplorerOptions();
        //TODO Set browser options

        driver = new InternetExplorerDriver(options);
    }
}
