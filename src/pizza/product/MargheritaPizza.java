package pizza.product;

import pizza.ingredient.*;

/**
 * Concrete Product in the Factory Method pattern.
 * Represents a Margherita pizza prepared with ingredients
 * provided by a specific PizzaIngredientFactory.
 */
public class MargheritaPizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    /**
     * @param factory ingredient factory that supplies dough, sauce, and cheese
     */
    public MargheritaPizza(PizzaIngredientFactory factory) {
        this.ingredientFactory = factory;
        this.name = "Margherita Pizza";
    }

    /**
     * Prepare pizza using the ingredient factory.
     * Each ingredient depends on the chosen factory (Italian, American, etc.).
     */
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

        // Debug info: show which ingredients were used
        System.out.println(" -> Dough: " + dough);
        System.out.println(" -> Sauce: " + sauce);
        System.out.println(" -> Cheese: " + cheese);
    }
}
