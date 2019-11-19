import driver.DriverManager;
import driver.DriverManagerFactory;
import driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {

    private WebDriver driver;

    @BeforeTest
    public void setEnv(){
        DriverManager driverManager = DriverManagerFactory.getDriverManger(DriverType.CHROME);
        driver = driverManager.getWebDriver();
    }

    @Test
    public void test() {

    }
}
