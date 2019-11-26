package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver driver;

    private WebElement usernameForm;
    private WebElement passwordForm;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        findWebElements();
    }

    private void findWebElements() {
        usernameForm = driver.findElement(By.id("user-name"));
        passwordForm = driver.findElement(By.id("password"));
    }

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
}