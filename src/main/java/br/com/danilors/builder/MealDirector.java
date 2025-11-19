package br.com.danilors.builder;

/**
 * The MealDirector is the 'Director' in the Builder pattern.
 * It constructs an object using the Builder interface.
 */
public class MealDirector {
    /**
     * Constructs a meal using the provided MealBuilder.
     * The director is responsible for the order of building steps.
     * @param mealBuilder the builder to use for constructing the meal
     */
    public void constructMeal(MealBuilder mealBuilder) {
        mealBuilder.buildMainCourse();
        mealBuilder.buildSideDish();
        mealBuilder.buildDrink();
    }
}
