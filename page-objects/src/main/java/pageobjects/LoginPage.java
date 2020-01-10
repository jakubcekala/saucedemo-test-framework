package pageobjects;
import managers.AssertionsManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import xpaths.LoginPageXPaths;

public class LoginPage extends AssertionsManager {

    @FindBy(how = How.XPATH, using = LoginPageXPaths.USERNAME_FORM_XPATH)
    private WebElement usernameForm;

    @FindBy(how = How.XPATH, using = LoginPageXPaths.PASSWORD_FORM_XPATH)
    private WebElement passwordForm;

    @FindBy(how = How.XPATH, using = LoginPageXPaths.LOGIN_BUTTON_XPATH)
    private WebElement loginButton;

    @FindBy(how = How.XPATH, using = LoginPageXPaths.ERROR_BUTTON_XPATH)
    private WebElement errorButton;

    @FindBy(how = How.XPATH, using = LoginPageXPaths.ERROR_AREA_XPATH)
    private WebElement errorArea;

    @FindBy(how = How.XPATH, using = LoginPageXPaths.LOGIN_LOGO_XPATH)
    private WebElement loginLogo;

    public void enterUsername(String username) {
        usernameForm.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordForm.sendKeys(password);
    }

    public void enterUsernameAndPassword(String username, String password) {
        enterUsername(username);
        enterPassword(password);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void loginErrorIsVisible(String errorText) {
        elementIsDisplayed(errorArea);
        Assert.assertEquals(errorText, errorArea.getText());
    }

    public MainPage login(String username, String password, WebDriver driver) {
        enterUsernameAndPassword(username, password);
        clickOnLoginButton();
        return PageFactory.initElements(driver, MainPage.class);
    }
}