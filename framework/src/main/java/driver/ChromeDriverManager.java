package driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends  DriverManager {

    protected void createWebDriver() {
        ChromeOptions options = new ChromeOptions();
        //TODO Set browser options

        driver = new ChromeDriver(options);
    }
}
