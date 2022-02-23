package Ticket;

import comanda.Comanda;
import extras.Extra;

import java.text.DecimalFormat;

public class Receipt implements Ticket{
    private Double total = 0.00;
    public Comanda order;
    public Extra firstExtra;

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
    public void setChain(Extra extra) {
        firstExtra = extra;
    }

    @Override
    public Extra getChain() {
        return firstExtra;
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
