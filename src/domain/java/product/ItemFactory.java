package product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class ItemFactory {
    private static final Set<Item> itemsFactory = new HashSet<Item>();

    public static Item getItem(String name, double price) {
        Optional<Item> desiredItem = itemsFactory.stream()
                                    .filter(i -> i.isRegular() && Objects.equals(i.name(), name))
                                    .findFirst();
        if (desiredItem.isPresent()) {
            return desiredItem.get();
        } else {
            Item newItem = new Item(name, price);
            itemsFactory.add(newItem);
            return newItem;
        }
    }

    // when the item has an extra ingredient
    public static Item getItem(String name, double price, String extra) {
        Optional<Item> desiredItem = itemsFactory.stream()
                .filter(i -> !i.isRegular()
                        && Objects.equals(i.name(), name)
                        && Objects.equals(i.extra, extra))
                .findFirst();
        if (desiredItem.isPresent()) {
            return desiredItem.get();
        } else {
            Item newItem = new Item(name, price, extra);
            itemsFactory.add(newItem);
            return newItem;
        }
    }

    public static int size() {
        return itemsFactory.size();
    }

    public static void clear() {
        itemsFactory.clear();
    }
}
