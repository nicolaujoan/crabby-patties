package extras;

import comanda.Comanda;
import product.Prices;

public class SizeLargeExtra extends Extra{
    private Double SIZE_PRICE = Prices.prices.get(SIZE_LARGE);

    public SizeLargeExtra(){}

    @Override
    public void sumExtras(Comanda comanda) {
        comanda.updateTotal(SIZE_PRICE);
    }
}
