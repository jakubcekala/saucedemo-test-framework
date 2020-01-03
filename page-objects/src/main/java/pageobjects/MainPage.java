package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MainPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu_button_container\"]/div/div[3]/div")
    private WebElement hamburgerMenuButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"shopping_cart_container\"]")
    private WebElement shoppingCardButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"inventory_filter_container\"]/select")
    private Select productSortSelect;

    @FindBy(how = How.XPATH, using = "//*[@id=\"inventory_container\"]/div/div")
    private List<WebElement> productItems;

    @FindBy(how = How.XPATH, using = "//*[@id=\"inventory_sidebar_link\"]")
    private WebElement allItemsButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"about_sidebar_link\"]")
    private WebElement aboutButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"logout_sidebar_link\"]")
    private WebElement logoutButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"reset_sidebar_link\"]")
    private WebElement resetAppStateButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu_button_container\"]/div/div[2]/div[2]/div")
    private WebElement closeMenuButton;
}
