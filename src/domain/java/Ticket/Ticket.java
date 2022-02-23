package Ticket;

import comanda.Comanda;
import extras.Extra;

public interface Ticket {
    Comanda getOrder();
    void setChain(Extra extra);
    Extra getChain();
    Double total();
    void sumExtrasCharge();
    void print();
}
