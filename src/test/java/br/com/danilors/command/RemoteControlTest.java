package br.com.danilors.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class RemoteControlTest {

    private Light livingRoomLight;
    private Light kitchenLight;
    private LightOnCommand livingRoomLightOn;
    private LightOffCommand livingRoomLightOff;
    private LightOnCommand kitchenLightOn;
    private LightOffCommand kitchenLightOff;
    private RemoteControl remote;

    @BeforeEach
    void setUp() {
        // Mock the Light objects to verify method calls
        livingRoomLight = Mockito.spy(new Light("Living Room"));
        kitchenLight = Mockito.spy(new Light("Kitchen"));

        livingRoomLightOn = new LightOnCommand(livingRoomLight);
        livingRoomLightOff = new LightOffCommand(livingRoomLight);
        kitchenLightOn = new LightOnCommand(kitchenLight);
        kitchenLightOff = new LightOffCommand(kitchenLight);

        remote = new RemoteControl();
    }

    @Test
    void testLivingRoomLightOn() {
        remote.setCommand(livingRoomLightOn);
        remote.pressButton();
        verify(livingRoomLight, times(1)).on();
        verify(livingRoomLight, times(0)).off();
    }

    @Test
    void testLivingRoomLightOff() {
        remote.setCommand(livingRoomLightOff);
        remote.pressButton();
        verify(livingRoomLight, times(1)).off();
        verify(livingRoomLight, times(0)).on();
    }

    @Test
    void testKitchenLightOnAndOff() {
        remote.setCommand(kitchenLightOn);
        remote.pressButton();
        verify(kitchenLight, times(1)).on();
        verify(kitchenLight, times(0)).off();

        remote.setCommand(kitchenLightOff);
        remote.pressButton();
        verify(kitchenLight, times(1)).off();
        verify(kitchenLight, times(1)).on(); // Still 1 from previous on() call
    }

    @Test
    void testNoCommandAssigned() {
        // No command set, pressing button should not throw exception and print message
        remote.pressButton();
        // Verification for no interaction with lights
        verify(livingRoomLight, times(0)).on();
        verify(livingRoomLight, times(0)).off();
        verify(kitchenLight, times(0)).on();
        verify(kitchenLight, times(0)).off();
    }
}
