package extras;

import comanda.Comanda;

import java.util.Optional;

public abstract class Extra {
    static final String CHEESE = "cheese";
    static final String SAUCE = "sauce";
    static final String SIZE_LARGE = "large";
    String extraProduct;
    Optional<Extra> nextExtra;

    public Extra(){}

    public void setNextExtra(Extra extra) {

    }

    public abstract void sumExtras(Comanda comanda);
}
