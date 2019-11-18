import driver.DriverManager;
import driver.DriverManagerFactory;
import driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Tests {

    private DriverManager driverManager;
    private WebDriver driver;

    @Test
    public void test() {
        driverManager = DriverManagerFactory.getDriverManger(DriverType.CHROME);
        driver = driverManager.getWebDriver();
    }
}
