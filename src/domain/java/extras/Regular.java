package extras;

import comanda.Comanda;
import product.Item;

import java.util.List;

public class Regular extends Extra{
    public Regular(){}

    @Override
    public void sumExtras(Comanda comanda) {
        List<Item> items = comanda.itemList();
        for (Item item: items) {
            comanda.updateTotal(item.price());
        }
        nextExtra.ifPresent(extra -> nextExtra.get().sumExtras(comanda));
    }
}
