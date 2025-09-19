package pizza.ingredient;

import pizza.ingredient.Ingredients.*;

/**
 * Concrete Factory (Abstract Factory pattern).
 * Provides American-style ingredients (thick crust, BBQ sauce, cheddar).
 */
public class AmericanIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        // American pizzas use a thick crust
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        // American pizzas often use BBQ sauce
        return new BBQSauce();
    }

    @Override
    public Cheese createCheese() {
        // American pizzas typically use cheddar cheese
        return new Cheddar();
    }
}
