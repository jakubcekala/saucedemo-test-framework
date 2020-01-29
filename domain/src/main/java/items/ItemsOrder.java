package items;

import models.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ItemsOrder {

    public static int[] defaultItemOrder = new int[] {4, 0, 1, 5, 2, 3};

    public static ArrayList<Item> defaultItemsOrderData = new ArrayList<Item>(
            Arrays.asList(new Item("Sauce Labs Backpack",
                            "Carry all the things with the sleek, streamlined Sly Pack that melds uncompromising " +
                                    "style with unequaled laptop and tablet protection.",
                            "$",
                            "29.99"),
                    new Item("Sauce Labs Bike Light",
                            "A red light isn't the desired state in testing but it sure helps when riding your bike " +
                                    "at night. Water-resistant with 3 lighting modes, 1 AAA battery included.",
                            "$",
                            "9.99"),
                    new Item("Sauce Labs Bolt T-Shirt",
                            "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, " +
                                    "100% ringspun combed cotton, heather gray with red bolt.",
                            "$",
                            "15.99"),
                    new Item("Sauce Labs Fleece Jacket",
                            "It's not every day that you come across a midweight quarter-zip fleece jacket capable " +
                                    "of handling everything from a relaxing day outdoors to a busy day at the office.",
                            "$",
                            "49.99"),
                    new Item("Sauce Labs Onesie",
                            "Rib snap infant onesie for the junior automation engineer in development. Reinforced " +
                                    "3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.",
                            "$",
                            "7.99"),
                    new Item("Sauce Labs T-Shirt (Red)",
                            "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard " +
                                    "to automate a few tests. Super-soft and comfy ringspun combed cotton.",
                            "$",
                            "15.99")
            )
    );

    public static String[] inventoryItemIdAZOrder = {"item_4_img_link",
                                                    "item_0_img_link",
                                                    "item_1_img_link",
                                                    "item_5_img_link",
                                                    "item_2_img_link",
                                                    "item_3_img_link"};
    public static String[] inventoryItemIdZAOrder = {"item_3_img_link",
                                                    "item_2_img_link",
                                                    "item_5_img_link",
                                                    "item_1_img_link",
                                                    "item_0_img_link",
                                                    "item_4_img_link"};
    public static String[] inventoryItemPriceLHOrder = {"item_2_img_link",
                                                    "item_0_img_link",
                                                    "item_1_img_link",
                                                    "item_3_img_link",
                                                    "item_4_img_link",
                                                    "item_5_img_link"};
    public static String[] inventoryItemPriceHLOrder = {"item_5_img_link",
                                                    "item_4_img_link",
                                                    "item_3_img_link",
                                                    "item_1_img_link",
                                                    "item_0_img_link",
                                                    "item_2_img_link"};
}
