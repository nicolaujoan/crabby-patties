package edu.poniperro.domain.Ticket;

import edu.poniperro.domain.comanda.Comanda;
import edu.poniperro.domain.extras.Extra;

public interface Ticket {
    Comanda getOrder();
    void setChain(Extra extra);
    Extra getChain();
    Double total();
    void sumExtrasCharge();
    void print();
}
