package edu.poniperro.testproduct;

import edu.poniperro.domain.product.Item;
import edu.poniperro.domain.product.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    Product patty = null;
    Product bits = null;
    Product rings = null;
    Product loaf = null;
    Product soda = null;

    @Before
    public void setup() {
        patty = new Item("Krabby Patty", 1.25);
        bits = new Item("Coral Bits", 1.00);
        rings = new Item("Kelp Rings", 1.50);
        loaf = new Item("Golden Loaf", 2.00);
        soda = new Item("Seafoam Soda", 1.00);
    }

    @Test
    public void testCli() {
        assertEquals("Krabby Patty....1,25$", patty.toString());
        assertEquals("Coral Bits....1,00$", bits.toString());
        assertEquals("Kelp Rings....1,50$", rings.toString());
        assertEquals("Golden Loaf....2,00$", loaf.toString());
        assertEquals("Seafoam Soda....1,00$", soda.toString());
    }
}
