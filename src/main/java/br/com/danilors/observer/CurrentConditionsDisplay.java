package br.com.danilors.observer;

/**
 * The CurrentConditionsDisplay acts as a 'ConcreteObserver' in the Observer pattern.
 * It displays the current temperature and humidity received from the WeatherStation.
 */
public class CurrentConditionsDisplay implements WeatherObserver {
    private float temperature;
    private float humidity;
    private String name;

    public CurrentConditionsDisplay(String name) {
        this.name = name;
    }

    /**
     * Updates the display with new weather measurements.
     *
     * @param temperature the current temperature
     * @param humidity the current humidity
     */
    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    /**
     * Prints the current weather conditions to the console.
     */
    public void display() {
        System.out.println(name + " - Current conditions: " + temperature + "C and " + humidity + "% humidity");
    }
}
