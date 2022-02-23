package extras;

import comanda.Comanda;
import product.Item;

import java.util.List;

public class SauceExtra extends Extra {
    private Double SAUCE_PRICE = 0.50;

    public SauceExtra(){
        extraProduct = SAUCE;
    }

    @Override
    public void sumExtras(Comanda comanda) {
        List<Item> items = comanda.itemList();
        for (Item item: items) {
            if (item.extra() == extraProduct) {
                comanda.updateTotal(SAUCE_PRICE);
            }
        }
        nextExtra.ifPresent(extra -> extra.sumExtras(comanda));
    }
}
