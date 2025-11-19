package br.com.danilors.builder;

/**
 * NonVegMealBuilder is another 'ConcreteBuilder' that constructs a non-vegetarian meal.
 */
public class NonVegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildMainCourse() {
        meal.addItem("Chicken Biryani");
    }

    @Override
    public void buildSideDish() {
        meal.addItem("Naan Bread");
    }

    @Override
    public void buildDrink() {
        meal.addItem("Coke");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
