package Ticket;

import comanda.Comanda;

public interface Ticket {
    Comanda getOrder();
    // setchain
    // getchain
    Double total();
    void sumExtrasCharge();
    void print();
}
