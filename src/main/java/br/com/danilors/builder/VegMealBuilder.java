package br.com.danilors.builder;

/**
 * VegMealBuilder is a 'ConcreteBuilder' that constructs a vegetarian meal.
 */
public class VegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildMainCourse() {
        meal.addItem("Vegetable Curry");
    }

    @Override
    public void buildSideDish() {
        meal.addItem("Rice");
    }

    @Override
    public void buildDrink() {
        meal.addItem("Water");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
