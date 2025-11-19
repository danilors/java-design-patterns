package br.com.danilors.observer;

/**
 * The WeatherObserver interface defines the contract for objects that want to be notified
 * of changes in weather data. This is the 'Observer' in the Observer pattern.
 */
public interface WeatherObserver {
    /**
     * Called when the weather data changes.
     *
     * @param temperature the current temperature
     * @param humidity the current humidity
     */
    void update(float temperature, float humidity);
}
