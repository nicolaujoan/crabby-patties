package extras;


import comanda.Comanda;
import product.Prices;

public class CheeseExtra extends Extra{
    private Double CHEESE_PRICE = Prices.prices.get(CHEESE);

    public CheeseExtra(){}

    @Override
    public void sumExtras(Comanda comanda) {
        comanda.updateTotal(CHEESE_PRICE);
    }
}
