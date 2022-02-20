package edu.poniperro.testproduct;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import product.Prices;

public class PricesTest {

    @Test
    public void displayTest() {
        Prices.init_prices();
        Prices.display();
    }
}
