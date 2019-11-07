package driver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverManager extends DriverManager {

    protected void createWebDriver() {
        EdgeOptions options = new EdgeOptions();
        //TODO Set browser options

        driver = new EdgeDriver(options);
    }
}
