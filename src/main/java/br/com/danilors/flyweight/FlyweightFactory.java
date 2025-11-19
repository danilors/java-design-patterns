package br.com.danilors.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * The Flyweight pattern uses sharing to support large numbers of fine-grained objects efficiently.
 */
public class FlyweightFactory {
    private Map<Integer, Flyweight> flyweights = new HashMap<>();

    /**
     * Returns a flyweight for the given key. If the flyweight does not exist, it is created.
     *
     * @param key the key of the flyweight
     * @return the flyweight
     */
    public Flyweight getFlyweight(int key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight(key));
        }
        return flyweights.get(key);
    }
}