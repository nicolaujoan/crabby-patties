package extras;


import comanda.Comanda;
import product.Item;

import java.util.List;

public class CheeseExtra extends Extra{
    private Double CHEESE_PRICE = 0.25;  // done this because need to init prices to take the prices

    public CheeseExtra(){
        extraProduct = CHEESE;
    }

    @Override
    public void sumExtras(Comanda comanda) {
        List<Item> items = comanda.itemList();
        for (Item item: items) {
            if (item.extra() == extraProduct) {
                comanda.updateTotal(CHEESE_PRICE);
            }
        }
        nextExtra.ifPresent(extra -> nextExtra.get().sumExtras(comanda));
    }
}
