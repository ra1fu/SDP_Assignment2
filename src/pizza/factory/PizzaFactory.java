package pizza.factory;

import pizza.product.Pizza;

/**
 * Abstract Creator in the Factory Method pattern.
 * Defines the template method for ordering a pizza
 * while delegating the actual pizza creation to subclasses.
 */
public abstract class PizzaFactory {

    /**
     * Template method for ordering a pizza.
     * 1. Create a pizza (delegated to subclass factory).
     * 2. If no matching pizza type is found → return null.
     * 3. Otherwise, run the standard preparation process.
     *
     * @param type the type of pizza requested (e.g., "margherita", "pepperoni")
     * @return a fully prepared Pizza or null if not available
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        if (pizza == null) {
            System.out.println("❌ Sorry, we don't have this type of pizza: " + type);
            return null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * Factory Method to be implemented by concrete factories.
     * Subclasses decide which Pizza to instantiate.
     *
     * @param type the type of pizza requested
     * @return a Pizza instance or null if unsupported
     */
    protected abstract Pizza createPizza(String type);
}
