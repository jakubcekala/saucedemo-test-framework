package pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class BasePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"user-name\"]")
    private WebElement usernameForm;

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    private WebElement passwordForm;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login_button_container\"]/div/form/input[3]")
    private WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login_button_container\"]/div/form/h3/button")
    private WebElement errorButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login_button_container\"]/div/form/h3")
    private WebElement errorArea;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]")
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
        errorArea.isDisplayed();
        Assert.assertEquals(errorText, errorArea.getText());
    }

    public void login(String username, String password) {
        enterUsernameAndPassword(username, password);
        clickOnLoginButton();
    }
}