package br.com.danilors.builder;

/**
 * The MealBuilder interface is the 'Builder' in the Builder pattern.
 * It declares the steps for building parts of the product object.
 */
public interface MealBuilder {
    /**
     * Builds the main course of the meal.
     */
    void buildMainCourse();

    /**
     * Builds the side dish of the meal.
     */
    void buildSideDish();

    /**
     * Builds the drink for the meal.
     */
    void buildDrink();

    /**
     * Returns the constructed Meal object.
     * @return the constructed Meal
     */
    Meal getMeal();
}
