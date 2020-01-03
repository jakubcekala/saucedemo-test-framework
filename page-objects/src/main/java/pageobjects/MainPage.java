package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import xpaths.MainPageXPaths;

import java.util.List;

public class MainPage extends LoggedInTemplate {
    @FindBy(how = How.XPATH, using = MainPageXPaths.PRODUCT_SORT_SELECT_XPATH)
    private Select productSortSelect;

    @FindBy(how = How.XPATH, using = MainPageXPaths.PRODUCT_ITEMS_XPATH)
    private List<WebElement> productItems;
}