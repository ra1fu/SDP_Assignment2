package pizza.ingredient;

/**
 * Container class for all ingredient abstractions and their variants.
 *
 * This design groups ingredient interfaces (Dough, Sauce, Cheese)
 * and their concrete implementations into one file to keep the
 * project structure compact.
 *
 * Each nested class overrides toString() to simplify logging and debugging.
 */
public final class Ingredients {

    // ===== Ingredient abstractions =====
    public interface Dough {}
    public interface Sauce {}
    public interface Cheese {}

    // ===== Dough implementations =====
    public static final class ThinCrustDough implements Dough {
        @Override public String toString() { return "Thin Crust Dough"; }
    }

    public static final class ThickCrustDough implements Dough {
        @Override public String toString() { return "Thick Crust Dough"; }
    }

    // ===== Sauce implementations =====
    public static final class TomatoSauce implements Sauce {
        @Override public String toString() { return "Tomato Sauce"; }
    }

    public static final class BBQSauce implements Sauce {
        @Override public String toString() { return "BBQ Sauce"; }
    }

    // ===== Cheese implementations =====
    public static final class Mozzarella implements Cheese {
        @Override public String toString() { return "Mozzarella"; }
    }

    public static final class Cheddar implements Cheese {
        @Override public String toString() { return "Cheddar"; }
    }

    // Prevent instantiation of utility container class
    private Ingredients() {}
}
