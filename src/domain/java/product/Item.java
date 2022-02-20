package product;

import java.text.DecimalFormat;

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
        return name;
    }

    @Override
    public Double price() {
        return price;
    }

    @Override
    public String extra() {
        return extra;
    }

    @Override
    public Boolean isRegular() {
        return extra == null;
    }

    // expected item format, as CLI desired output
    @Override
    public String toString() {
        DecimalFormat ft = new DecimalFormat("0.00");
        if (this.isRegular()) {
            return name() + "...." + ft.format(price) + "$";
        }
        return name() + " w/ " + extra() + "...." + ft.format(price) + "$ + "
                + Prices.prices.get(extra()) + "$" ;
    }

    // to compare Item objects
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Item) {
//            return this.name.equals(((Item)obj).name);
//        }
//        return false;
//    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }


}
