package br.com.danilors.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class WeatherStationTest {

    private WeatherStation weatherStation;
    private CurrentConditionsDisplay display1;
    private CurrentConditionsDisplay display2;

    @BeforeEach
    void setUp() {
        weatherStation = new WeatherStation();
        display1 = Mockito.spy(new CurrentConditionsDisplay("Display 1")); // Use Mockito.spy to verify method calls
        display2 = Mockito.spy(new CurrentConditionsDisplay("Display 2"));
    }

    @Test
    void testObserverNotification() {
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        float temperature = 25.5f;
        float humidity = 65.0f;

        weatherStation.setMeasurements(temperature, humidity);

        // Verify that update was called on both displays with the correct values
        verify(display1, times(1)).update(temperature, humidity);
        verify(display2, times(1)).update(temperature, humidity);

        // Change measurements again
        temperature = 28.0f;
        humidity = 70.0f;
        weatherStation.setMeasurements(temperature, humidity);

        verify(display1, times(1)).update(temperature, humidity); // Should be called again
        verify(display2, times(1)).update(temperature, humidity); // Should be called again
    }

    @Test
    void testRemoveObserver() {
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        weatherStation.removeObserver(display1);

        float temperature = 22.0f;
        float humidity = 60.0f;
        weatherStation.setMeasurements(temperature, humidity);

        // Only display2 should have been notified
        verify(display1, times(0)).update(temperature, humidity); // Should not be called
        verify(display2, times(1)).update(temperature, humidity); // Should be called
    }

    @Test
    void testNoObservers() {
        // No observers added, setting measurements should not cause errors
        weatherStation.setMeasurements(10.0f, 30.0f);
        // No verification needed for observers as none are registered.
        // Just ensuring no exceptions are thrown.
    }
}
