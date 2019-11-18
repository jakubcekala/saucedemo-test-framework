package driver;

import drivers.DriversData;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverManager extends DriverManager {

    protected void createWebDriver() {
        System.setProperty(DriversData.DriversProperty.EDGE, DriversData.DriversPath.EDGE);

        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
    }
}
