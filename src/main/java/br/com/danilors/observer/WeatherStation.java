package br.com.danilors.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The WeatherStation acts as the 'Subject' in the Observer pattern. It maintains weather data
 * (temperature and humidity) and notifies all registered WeatherObservers when this data changes.
 */
public class WeatherStation {
    private List<WeatherObserver> observers = new ArrayList<>();
    private float temperature;
    private float humidity;

    /**
     * Registers a new weather observer.
     *
     * @param observer the observer to register
     */
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
        System.out.println("Observer added.");
    }

    /**
     * Removes a weather observer.
     *
     * @param observer the observer to remove
     */
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
        System.out.println("Observer removed.");
    }

    /**
     * Sets new weather measurements and notifies all registered observers.
     *
     * @param temperature the new temperature
     * @param humidity the new humidity
     */
    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        System.out.println("New measurements: Temperature=" + temperature + "C, Humidity=" + humidity + "%");
        notifyObservers();
    }

    /**
     * Notifies all registered observers with the current weather measurements.
     */
    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}
