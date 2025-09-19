package pizza.ingredient;

import pizza.ingredient.Ingredients.*;

/**
 * Abstract Factory for creating families of related pizza ingredients.
 *
 * This interface defines the contract for ingredient factories:
 * each concrete factory (e.g., ItalianIngredientFactory, AmericanIngredientFactory)
 * must provide its own implementations of dough, sauce, and cheese.
 */
public interface PizzaIngredientFactory {

    /**
     * @return a Dough implementation (e.g., ThinCrustDough, ThickCrustDough)
     */
    Dough createDough();

    /**
     * @return a Sauce implementation (e.g., TomatoSauce, BBQSauce)
     */
    Sauce createSauce();

    /**
     * @return a Cheese implementation (e.g., Mozzarella, Cheddar)
     */
    Cheese createCheese();
}
