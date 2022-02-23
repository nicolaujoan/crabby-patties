package extras;

import comanda.Comanda;
import product.Prices;

public class SauceExtra extends Extra {
    private Double SAUCE_PRICE = Prices.prices.get(SAUCE);

    public SauceExtra(){}

    @Override
    public void sumExtras(Comanda comanda) {
        comanda.updateTotal(SAUCE_PRICE);
    }
}
