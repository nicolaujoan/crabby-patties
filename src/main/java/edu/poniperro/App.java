package edu.poniperro;

import Ticket.Ticket;
import Ticket.Receipt;
import comanda.Comanda;
import comanda.Order;
import product.Item;
import product.Prices;
import product.Product;

public class App {
    public static void main(String[] args) {
        /**
         * Crea un diccionario con los precios
         * de los extras.
         *
         *  Los precios de los extras son estos:
         *  - cheese +0.25
         *  - sauce +0.50
         *  - medium +0.25
         *  - large +0.50
         *
         * Lee los precios de los items en la imagen
         * del menu proporcionada.
         */

        Prices.init_prices();

        // formatea la salida de cada entrada del diccionario como prefieras
        System.out.print("\n\t --- PRICES ---  \n");
        Prices.display();

        /**
         * Crea los items del menu
         * y printa sus datos.
         *
         * Krabby Patty
         * Coral Bits
         * Kelp Rings
         * Golden Loaf
         * Seafoam Soda
         *
         * Incluye los metodos sobrescritos
         * equals y hascode para comparar objetos
         * de tipo Item.
         */

        System.out.print("\n\t --- GALLEY GRUB ---  \n");

        Product patty = new Item("Krabby Patty", 1.25);
        display(patty);
        Product bits = new Item("Coral Bits", 1.00);
        display(bits);
        Product rings = new Item("Kelp Rings", 1.50);
        display(rings);
        Product loaf = new Item("Golden Loaf", 2.00);
        display(loaf);
        Product soda = new Item("Seafoam Soda", 1.00);
        display(soda);

        /* **
         * Bubble Bass llega al restaurante
         * y hace una comanda muy simple.
         * Quiere todo lo que hay en el menu
         * en su tamaño estandar y sin
         * condimentos extras.
         *
         * Squidward Tentacles crea la comanda
         * y la muestra en la pantalla para que
         * el cliente le de el visto bueno
         * antes de generar el recibo con la factura.
         *
         *
         * OPCIONAL:
         * Puesto que a lo largo del dia van a generarse muchos objetos
         * siempre del mismo tipo, vamos a ahorrar memoria.
         *
         * Implementa la clase ItemFactory siguiendo los casos test
         * que se proporcionan.
         *
         * ItemFactory crea el Item que le pides,
         * lo guarda en un diccionario y lo devuelve.
         * Cuando solicitas crear de nuevo ese Item
         * te devuelve la misma referencia al objeto que has creado antes,
         * ahorrando asi memoria.
         */

        Comanda order = new Order();

        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);
        order.addItem("Kelp Rings", 1.50);
        order.addItem("Golden Loaf", 2.00);
        order.addItem("Seafoam Soda", 1.00);

        order.display();

        /**
         * Squidward Tentacles genera el recibo,
         * la app calcula el importe total de la comanda
         * y lo muestra en pantalla.
         */

        Ticket receipt = new Receipt(order);
        receipt.total();
        receipt.print();

         /**
         * Eugene H. Krabs quiere obtener un margen
         * de beneficio extra y decide cargar
         * por los extras.
         *
         * Modifica el tipo Item para incluir los extras.
         *
         * Refactoriza el metodo toString() de Item
         * para mostrar el ingrediente extra.
         *
         * NO ACTUALICES EL PRECIO DEL ITEM
         * con el cargo extra
         * pues eso lo haremos con otro componente.
         */

        System.out.print("\n\t --- GALLEY GRUB ---  \n");

        patty = new Item("Krabby Patty", 1.25, "cheese");
        display(patty);
        bits = new Item("Coral Bits", 1.00, "medium");
        display(bits);
        rings = new Item("Kelp Rings", 1.50, "sauce");
        display(rings);
        loaf = new Item("Golden Loaf", 2.00, "sauce");
        display(loaf);
        soda = new Item("Seafoam Soda", 1.00, "large");
        display(soda);

    }

    public static void display(Product item) {
        System.out.print("\t" + item.toString() + "\n");
    }
    
}
