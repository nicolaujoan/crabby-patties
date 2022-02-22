package product;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory2 {
    // itemFactory using hashMap collection instead of a set
    private static final Map<String, Item> itemsFactory = new HashMap<String, Item>();

    public static Item getItem(String name, double price) {
        if (itemsFactory.containsKey(name)) {
            return itemsFactory.get(name);
        } else {
            Item newItem = new Item(name, price);
            itemsFactory.put(name, newItem);
            return newItem;
        }
    }

    public static Item getItem(String name, double price, String extra) {
        String itemWithExtra = name + " /w " + extra;
        if (itemsFactory.containsKey(itemWithExtra)) {
            return itemsFactory.get(itemWithExtra);
        } else {
            Item newItem = new Item(name, price, extra);
            itemsFactory.put(itemWithExtra, newItem);
            return newItem;
        }
    }
}
