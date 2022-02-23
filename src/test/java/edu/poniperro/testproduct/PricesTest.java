package edu.poniperro.testproduct;

import edu.poniperro.domain.product.Prices;
import org.junit.Test;

public class PricesTest {

    @Test
    public void displayTest() {
        Prices.init_prices();
        Prices.display();
    }
}
