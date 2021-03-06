package edu.poniperro.domain.extras;

import edu.poniperro.domain.comanda.Comanda;
import edu.poniperro.domain.product.Item;

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
        nextExtra.ifPresent(extra -> nextExtra.get().sumExtras(comanda));
    }
}
