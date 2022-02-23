package extras;

import comanda.Comanda;
import product.Item;

import java.util.List;

public class SizeLargeExtra extends Extra{
    private Double SIZE_PRICE = 0.50;

    public SizeLargeExtra(){
        extraProduct = SIZE_LARGE;
    }

    @Override
    public void sumExtras(Comanda comanda) {
        List<Item> items = comanda.itemList();
        for (Item item: items) {
            if (item.extra() == (extraProduct)) {
                comanda.updateTotal(SIZE_PRICE);
            }
        }
        nextExtra.ifPresent(extra -> nextExtra.get().sumExtras(comanda));
    }
}
