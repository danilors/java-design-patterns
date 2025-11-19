package br.com.danilors.prototype;

/**
 * The Shape interface is the 'Prototype' interface in the Prototype pattern.
 * It declares an interface for cloning itself.
 */
public abstract class Shape implements Cloneable {
    protected String id;
    protected String type;

    public abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Creates and returns a copy of this object.
     * The exact meaning of "copy" may depend on the class of the object.
     * @return a clone of this instance
     */
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
