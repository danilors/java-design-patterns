package br.com.danilors.prototype;

/**
 * The Prototype pattern specifies the kind of objects to create using a prototypical instance, and creates new objects by copying this prototype.
 */
public class ConcretePrototype implements Prototype {
    private String field;

    /**
     * Constructs a new ConcretePrototype with the given field.
     *
     * @param field the field value
     */
    public ConcretePrototype(String field) {
        this.field = field;
    }

    /**
     * Creates a new object by copying this prototype.
     *
     * @return a clone of this instance
     */
    @Override
    public Prototype clone() {
        return new ConcretePrototype(field);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "field='" + field + '\'' +
                '}';
    }
}