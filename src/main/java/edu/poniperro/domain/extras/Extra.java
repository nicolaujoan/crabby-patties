package edu.poniperro.domain.extras;

import edu.poniperro.domain.comanda.Comanda;

import java.util.Optional;

public abstract class Extra {
    static final String CHEESE = "cheese";
    static final String SAUCE = "sauce";
    static final String SIZE_LARGE = "large";
    String extraProduct;
    Optional<Extra> nextExtra = Optional.empty();

    public Extra(){}

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = Optional.of(nextExtra);
    }

    public abstract void sumExtras(Comanda comanda);
}
