package br.com.danilors.visitor;

public interface Element {
    void accept(Visitor visitor);
}