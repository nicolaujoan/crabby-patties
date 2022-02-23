package edu.poniperro.domain.product;

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
                + ft.format(Prices.prices.get(extra)) + "$" ;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Item) {
//            if (((Item) obj).isRegular()) {
//                return this.name.equals(((Item) obj).name);
//            } else {
//                return this.name.equals(((Item) obj).name) && this.extra.equals(((Item) obj).extra);
//            }
//        }
//        return false;
//    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }


}
