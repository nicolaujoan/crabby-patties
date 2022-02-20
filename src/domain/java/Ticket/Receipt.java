package Ticket;

import comanda.Comanda;

import java.text.DecimalFormat;

public class Receipt implements Ticket{
    private Double total = 0.00;
    private Comanda order = null;

    public Receipt(Comanda order) {
        this.order = order;
    }

    @Override
    public Comanda getOrder() {
        return order;
    }

    @Override
    public Double total() {
        return total;
    }

    @Override
    public void sumExtrasCharge() {

    }

    @Override
    public void print() {
        DecimalFormat ft = new DecimalFormat("0.00");
        getOrder().display();
        System.out.println("\tTOTAL --------> " + ft.format(total()) + "$");
    }
}
