package br.com.danilors.mediator;

public interface Mediator {
    void send(String message, Colleague colleague);
}