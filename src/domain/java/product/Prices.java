package product;

import java.util.HashMap;
import java.util.Map;
import java.text.DecimalFormat;

public class Prices {
    public   static final Map<String, Double> prices = new HashMap<String, Double>();

    public static void init_prices() {
        // array of enumType created
        ExtrasInfo[] extrasInfo = ExtrasInfo.values();

        // for each extra, add it to our map -> key, value
        for (ExtrasInfo extra: extrasInfo) {
            prices.put(
                    extra.name().toLowerCase(),
                    extra.getPrice()
            );
        }
    }

    public static void display() {
        // using a custom format in our prices
        DecimalFormat ft = new DecimalFormat("0.00");

        // displaying key, value pairs of prices
        prices.forEach((String name, Double price) -> {
            System.out.println("\t" + name + ": " + ft.format(price) + "$");
        });
    }
}
