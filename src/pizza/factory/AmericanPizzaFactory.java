package pizza.factory;

import pizza.product.*;
import pizza.ingredient.*;

/**
 * Concrete Factory (Factory Method).
 * Responsible for creating pizzas with American-style ingredients.
 *
 * If a requested pizza type is not supported, returns null.
 */
public class AmericanPizzaFactory extends PizzaFactory {

    @Override
    protected Pizza createPizza(String type) {
        // Use the American ingredient factory to assemble pizzas
        PizzaIngredientFactory factory = new AmericanIngredientFactory();

        // Decide which pizza to create based on the type
        if (type.equalsIgnoreCase("margherita")) {
            return new MargheritaPizza(factory);
        } else if (type.equalsIgnoreCase("pepperoni")) {
            return new PepperoniPizza(factory);
        }

        // No matching pizza type found → return null
        return null;
    }
}
