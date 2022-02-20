package comanda;

import product.Item;

import java.util.List;

public interface Comanda {
    void addItem(String name, double price);
    void addItem(String name, double price, String extra);
    int size();
    List<Item> itemList();
    Double getTotal();
    void updateTotal(Double price);
    void display();
}
