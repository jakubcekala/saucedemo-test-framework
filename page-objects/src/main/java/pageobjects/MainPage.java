package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import xpaths.MainPageXPaths;

import java.util.List;

public class MainPage {
    @FindBy(how = How.XPATH, using = MainPageXPaths.HAMBURGER_MENU_BUTTON_XPATH)
    private WebElement hamburgerMenuButton;

    @FindBy(how = How.XPATH, using = MainPageXPaths.SHOPPING_CARD_BUTTON_XPATH)
    private WebElement shoppingCardButton;

    @FindBy(how = How.XPATH, using = MainPageXPaths.PRODUCT_SORT_SELECT_XPATH)
    private Select productSortSelect;

    @FindBy(how = How.XPATH, using = MainPageXPaths.PRODUCT_ITEMS_XPATH)
    private List<WebElement> productItems;

    @FindBy(how = How.XPATH, using = MainPageXPaths.ALL_ITEMS_BUTTON_XPATH)
    private WebElement allItemsButton;

    @FindBy(how = How.XPATH, using = MainPageXPaths.ABOUT_BUTTON_XPATH)
    private WebElement aboutButton;

    @FindBy(how = How.XPATH, using = MainPageXPaths.LOGOUT_BUTTON_XPATH)
    private WebElement logoutButton;

    @FindBy(how = How.XPATH, using = MainPageXPaths.RESET_APP_STATE_BUTTON_XPATH)
    private WebElement resetAppStateButton;

    @FindBy(how = How.XPATH, using = MainPageXPaths.CLOSE_MENU_BUTTON_XPATH)
    private WebElement closeMenuButton;
}