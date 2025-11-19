package br.com.danilors.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    /**
     * Adds an observer to the list of observers.
     *
     * @param observer the observer to add
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the list of observers.
     *
     * @param observer the observer to remove
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Sets the message and notifies the observers.
     *
     * @param message the new message
     */
    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    /**
     * Notifies all observers of a change.
     */
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}