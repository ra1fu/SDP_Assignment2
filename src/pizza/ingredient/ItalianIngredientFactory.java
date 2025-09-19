package pizza.ingredient;

import pizza.ingredient.Ingredients.*;

/**
 * Concrete Factory (Abstract Factory pattern).
 * Provides Italian-style ingredients (thin crust, tomato sauce, mozzarella).
 */
public class ItalianIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        // Italian pizzas are typically made with thin crust
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        // Italian pizzas commonly use tomato sauce
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        // Mozzarella is the classic Italian cheese for pizzas
        return new Mozzarella();
    }
}
