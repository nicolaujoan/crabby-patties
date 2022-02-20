package product;

public class Item implements Product{
    String name;
    Double price;
    String extra;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }


    @Override
    public String name() {
        return null;
    }

    @Override
    public Double price() {
        return null;
    }

    @Override
    public String extra() {
        return null;
    }

    @Override
    public Boolean isRegular() {
        return null;
    }

    // to string
    // equals
    // hashcode
}
