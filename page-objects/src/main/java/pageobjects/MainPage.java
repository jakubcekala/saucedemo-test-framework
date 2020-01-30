package pageobjects;

import items.ItemsOrder;
import models.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import xpaths.MainPageXPaths;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends LoggedInTemplate {

    @FindBy(how = How.XPATH, using = MainPageXPaths.PRODUCT_SORT_SELECT_XPATH)
    private Select productSortSelect;

    @FindBy(how = How.XPATH, using = MainPageXPaths.PRODUCT_ITEMS_XPATH)
    private List<WebElement> productItems;

    ArrayList<Item> productItemsList = new ArrayList<Item>();

    public void itemsAreSortedByDefault() {
        itemsAreSortedByNameAZ();
    }

    public void itemsAreSortedByNameAZ() {
        for (int index = 0; index < getProductItems().size(); index++) {
            productItems.get(index).findElement(By.id(ItemsOrder.inventoryItemIdAZOrder[index]));
            index++;
        }
    }

    public void itemsAreSortedByNameZA() {
        for (int index = 0; index < getProductItems().size(); index++) {
            productItems.get(index).findElement(By.id(ItemsOrder.inventoryItemIdZAOrder[index]));
            index++;
        }
    }

    public void itemsAreSortedByPriceLH() {
        for (int index = 0; index < getProductItems().size(); index++) {
            productItems.get(index).findElement(By.id(ItemsOrder.inventoryItemPriceLHOrder[index]));
            index++;
        }
    }

    public void itemsAreSortedByPriceHL() {
        for (int index = 0; index < getProductItems().size(); index++) {
            productItems.get(index).findElement(By.id(ItemsOrder.inventoryItemPriceHLOrder[index]));
            index++;
        }
    }

    public ArrayList<Item> getProductItems() {
        ArrayList<Item> _productItemsList = new ArrayList<Item>();
        for (WebElement productItem: productItems) {
            Item item = new Item(
                    productItem.findElement(By.className("inventory_item_name")).getText(),
                    productItem.findElement(By.className("inventory_item_desc")).getText(),
                    productItem.findElement(By.className("inventory_item_price")).getText().substring(0,1),
                    productItem.findElement(By.className("inventory_item_price")).getText().substring(1)
            );
            _productItemsList.add(item);
        }
        return _productItemsList;
    }
}