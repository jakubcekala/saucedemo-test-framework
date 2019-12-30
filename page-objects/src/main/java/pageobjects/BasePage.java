package pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"user-name\"]")
    private WebElement usernameForm;

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    private WebElement passwordForm;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login_button_container\"]/div/form/input[3]")
    private WebElement loginButton;

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
}