package br.com.danilors.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeverageDecoratorTest {

    @Test
    void testEspressoWithMilk() {
        Beverage espresso = new Espresso();
        espresso = new Milk(espresso); // Decorate with Milk

        assertEquals("Espresso, Milk", espresso.getDescription());
        assertEquals(1.99 + 0.50, espresso.getCost(), 0.001); // Use delta for double comparison
    }

    @Test
    void testHouseBlendWithMilkAndSugar() {
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend); // Decorate with Milk
        houseBlend = new Sugar(houseBlend); // Decorate with Sugar

        assertEquals("House Blend Coffee, Milk, Sugar", houseBlend.getDescription());
        assertEquals(0.89 + 0.50 + 0.10, houseBlend.getCost(), 0.001);
    }

    @Test
    void testEspressoOnly() {
        Beverage espresso = new Espresso();
        assertEquals("Espresso", espresso.getDescription());
        assertEquals(1.99, espresso.getCost(), 0.001);
    }

    @Test
    void testHouseBlendOnly() {
        Beverage houseBlend = new HouseBlend();
        assertEquals("House Blend Coffee", houseBlend.getDescription());
        assertEquals(0.89, houseBlend.getCost(), 0.001);
    }
}
