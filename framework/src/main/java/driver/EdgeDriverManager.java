package driver;

import drivers.DriversData;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverManager extends DriverManager {

    protected void createWebDriver() {
        WebDriverManager.edgedriver().version(DriversData.BrowserVersions.EDGE).setup();
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
    }
}
