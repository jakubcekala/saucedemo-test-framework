package pageobjects;

import managers.AssertionsManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import xpaths.LoggedInTemplateXPaths;

public abstract class LoggedInTemplate extends AssertionsManager {
    @FindBy(how = How.XPATH, using = LoggedInTemplateXPaths.HAMBURGER_MENU_BUTTON_XPATH)
    protected WebElement hamburgerMenuButton;

    @FindBy(how = How.XPATH, using = LoggedInTemplateXPaths.SHOPPING_CARD_BUTTON_XPATH)
    protected WebElement shoppingCardButton;

    @FindBy(how = How.XPATH, using = LoggedInTemplateXPaths.ALL_ITEMS_BUTTON_XPATH)
    protected WebElement allItemsButton;

    @FindBy(how = How.XPATH, using = LoggedInTemplateXPaths.ABOUT_BUTTON_XPATH)
    protected WebElement aboutButton;

    @FindBy(how = How.XPATH, using = LoggedInTemplateXPaths.LOGOUT_BUTTON_XPATH)
    protected WebElement logoutButton;

    @FindBy(how = How.XPATH, using = LoggedInTemplateXPaths.RESET_APP_STATE_BUTTON_XPATH)
    protected WebElement resetAppStateButton;

    @FindBy(how = How.XPATH, using = LoggedInTemplateXPaths.CLOSE_MENU_BUTTON_XPATH)
    protected WebElement closeMenuButton;

    public void mainTemplateElementsAreDisplayed() {
        elementIsDisplayed(hamburgerMenuButton);
        elementIsDisplayed(shoppingCardButton);
    }

    public void hamburgerMenuElementsAreDisplayed() {
        elementIsDisplayed(allItemsButton);
        elementIsDisplayed(aboutButton);
        elementIsDisplayed(logoutButton);
        elementIsDisplayed(resetAppStateButton);
        elementIsDisplayed(closeMenuButton);
    }
}