import driver.DriverManager;
import driver.DriverManagerFactory;
import driver.DriverType;
import errors.LoginErrorTexts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pageobjects.BasePage;
import pageobjects.MainPage;

public class Tests {

    private WebDriver driver;

    @BeforeMethod
    public void setEnv() {
        DriverManager driverManager = DriverManagerFactory.getDriverManger(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void usernameRequiredTest() {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        basePage.clickOnLoginButton();
        basePage.loginErrorIsVisible(LoginErrorTexts.USERNAME_REQUIRED_ERROR);
        basePage.enterPassword(Credentials.CORRECT_PASSWORD);
        basePage.clickOnLoginButton();
        basePage.loginErrorIsVisible(LoginErrorTexts.USERNAME_REQUIRED_ERROR);
    }

    @Test
    public void passwordRequiredTest() {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        basePage.enterUsername(Credentials.STANDARD_USER);
        basePage.clickOnLoginButton();
        basePage.loginErrorIsVisible(LoginErrorTexts.PASSWORD_REQUIRED_ERROR);
    }

    @Test
    public void credentialsNotMatchTest() {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        basePage.enterUsernameAndPassword(Credentials.NOT_EXISTING_USER, Credentials.INCORRECT_PASSWORD);
        basePage.clickOnLoginButton();
        basePage.loginErrorIsVisible(LoginErrorTexts.CREDENTIALS_NOT_MATCH_ERROR);
    }

    @Test
    public void incorrectPasswordTest() {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        basePage.enterUsernameAndPassword(Credentials.STANDARD_USER, Credentials.INCORRECT_PASSWORD);
        basePage.clickOnLoginButton();
        basePage.loginErrorIsVisible(LoginErrorTexts.CREDENTIALS_NOT_MATCH_ERROR);
    }

    @Test
    public void incorrectUsernameTest() {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        basePage.enterUsernameAndPassword(Credentials.NOT_EXISTING_USER, Credentials.CORRECT_PASSWORD);
        basePage.clickOnLoginButton();
        basePage.loginErrorIsVisible(LoginErrorTexts.CREDENTIALS_NOT_MATCH_ERROR);
    }

    @Test
    public void userLockedOutTest() {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        basePage.enterUsernameAndPassword(Credentials.LOCKED_OUT_USER, Credentials.CORRECT_PASSWORD);
        basePage.clickOnLoginButton();
        basePage.loginErrorIsVisible(LoginErrorTexts.LOCKED_USER_ERROR);
    }

    @Test
    public void loginTest() {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        MainPage mainPage = basePage.login(Credentials.STANDARD_USER, Credentials.CORRECT_PASSWORD, driver);
    }

    @AfterMethod
    public void quitDriver() {
        driver.quit();
        driver = null;
    }
}
