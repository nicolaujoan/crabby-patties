package comanda;

import product.Item;
import product.ItemFactory;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda{
    private Double total = 0.00;
    private final List<Item> items = new ArrayList<>();

    public Order(){}

    @Override
    public void addItem(String name, double price) {
        items.add(ItemFactory.getItem(name, price));
    }

    @Override
    public void addItem(String name, double price, String extra) {
        items.add(ItemFactory.getItem(name, price, extra));
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public List<Item> itemList() {
        return items;
    }

    @Override
    public Double getTotal() {
        return total;
    }

    @Override
    public void updateTotal(Double price) {
        total += price;
    }

    @Override
    public void display() {
        System.out.println("\n\t--- ORDER ---");
        itemList().forEach(this::itemDisplay);
    }

    private void itemDisplay(Item item) {
        System.out.println("\t" + item);
    }
}
