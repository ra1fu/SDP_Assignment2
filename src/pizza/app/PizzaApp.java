package pizza.app;

import pizza.factory.*;
import pizza.product.Pizza;

public class PizzaApp {
    public static void main(String[] args) {
        // Initialize pizza factories for different styles
        PizzaFactory italianFactory = new ItalianPizzaFactory();
        PizzaFactory americanFactory = new AmericanPizzaFactory();

        // Order a Margherita from the Italian factory
        Pizza margherita = italianFactory.orderPizza("margherita");
        System.out.println("✅ Ordered: " + margherita.getName());

        System.out.println("--------------------");

        // Order a Pepperoni from the American factory
        Pizza pepperoni = americanFactory.orderPizza("pepperoni");
        System.out.println("✅ Ordered: " + pepperoni.getName());

        System.out.println("--------------------");

        // Attempt to order a pizza type not supported by the factory
        Pizza unknown = italianFactory.orderPizza("hawaiian");
        if (unknown == null) {
            System.out.println("❌ Sorry, this type of pizza is not available.");
        }
    }
}
