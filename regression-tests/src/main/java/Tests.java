import driver.DriverManager;
import driver.DriverManagerFactory;
import driver.DriverType;
import errors.LoginErrorTexts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pageobjects.LoginPage;
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
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickOnLoginButton();
        loginPage.loginErrorIsVisible(LoginErrorTexts.USERNAME_REQUIRED_ERROR);
        loginPage.enterPassword(Credentials.CORRECT_PASSWORD);
        loginPage.clickOnLoginButton();
        loginPage.loginErrorIsVisible(LoginErrorTexts.USERNAME_REQUIRED_ERROR);
    }

    @Test
    public void passwordRequiredTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterUsername(Credentials.STANDARD_USER);
        loginPage.clickOnLoginButton();
        loginPage.loginErrorIsVisible(LoginErrorTexts.PASSWORD_REQUIRED_ERROR);
    }

    @Test
    public void credentialsNotMatchTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterUsernameAndPassword(Credentials.NOT_EXISTING_USER, Credentials.INCORRECT_PASSWORD);
        loginPage.clickOnLoginButton();
        loginPage.loginErrorIsVisible(LoginErrorTexts.CREDENTIALS_NOT_MATCH_ERROR);
    }

    @Test
    public void incorrectPasswordTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterUsernameAndPassword(Credentials.STANDARD_USER, Credentials.INCORRECT_PASSWORD);
        loginPage.clickOnLoginButton();
        loginPage.loginErrorIsVisible(LoginErrorTexts.CREDENTIALS_NOT_MATCH_ERROR);
    }

    @Test
    public void incorrectUsernameTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterUsernameAndPassword(Credentials.NOT_EXISTING_USER, Credentials.CORRECT_PASSWORD);
        loginPage.clickOnLoginButton();
        loginPage.loginErrorIsVisible(LoginErrorTexts.CREDENTIALS_NOT_MATCH_ERROR);
    }

    @Test
    public void userLockedOutTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterUsernameAndPassword(Credentials.LOCKED_OUT_USER, Credentials.CORRECT_PASSWORD);
        loginPage.clickOnLoginButton();
        loginPage.loginErrorIsVisible(LoginErrorTexts.LOCKED_USER_ERROR);
    }

    @Test
    public void loginTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        MainPage mainPage = loginPage.login(Credentials.STANDARD_USER, Credentials.CORRECT_PASSWORD, driver);
        mainPage.mainTemplateElementsAreDisplayed();
    }

    @AfterMethod
    public void quitDriver() {
        driver.quit();
        driver = null;
    }
}
