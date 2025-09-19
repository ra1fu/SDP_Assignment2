package pizza.product;

import pizza.ingredient.Ingredients.*;

/**
 * Abstract Product in the Factory Method pattern.
 * Represents the general structure and behavior of a Pizza.
 *
 * Subclasses (e.g., MargheritaPizza, PepperoniPizza) define
 * how the pizza is prepared with ingredients provided by
 * a PizzaIngredientFactory.
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;

    /**
     * Preparation step must be implemented by concrete pizzas.
     * It defines how ingredients are assembled (depends on the chosen factory).
     */
    public abstract void prepare();

    /**
     * Common baking procedure for all pizzas.
     */
    public void bake() {
        System.out.println("Baking " + name + " at 200°C");
    }

    /**
     * Common cutting procedure for all pizzas.
     */
    public void cut() {
        System.out.println("Cutting " + name + " into slices");
    }

    /**
     * Common boxing procedure for all pizzas.
     */
    public void box() {
        System.out.println("Boxing " + name);
    }

    /**
     * @return the name of the pizza
     */
    public String getName() {
        return name;
    }
}
