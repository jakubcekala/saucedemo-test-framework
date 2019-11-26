import driver.DriverManager;
import driver.DriverManagerFactory;
import driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.BasePage;

public class Tests {

    private WebDriver driver;

    @BeforeTest
    public void setEnv(){
        DriverManager driverManager = DriverManagerFactory.getDriverManger(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void test() {
        BasePage basePage = new BasePage(driver);
        basePage.enterUsername("Test");
        basePage.enterPassword("Test");
    }
}
