package net.sf.gilead.pojo.gwt.basic;

import net.sf.gilead.pojo.gwt.IGwtSerializableParameter;

/**
 * Float parameter.
 *
 * @author bruno.marchesson
 */
public class FloatParameter implements IGwtSerializableParameter {

    private static final long serialVersionUID = 2165631776081297493L;

    /**
     * The underlying value.
     */
    private Float value;

    /**
     * Empty constructor (needed by GWT)
     */
    public FloatParameter() {}

    /**
     * Constructor.
     */
    public FloatParameter(Float value) {
        this.value = value;
    }

    /**
     * Change value.
     */
    public void setUnderlyingValue(Float value) {
        this.value = value;
    }

    /**
     * @return the underlying value
     */
    @Override
    public Object getUnderlyingValue() {
        return this.value;
    }
}
