package org.example.singletonpattern;

public class FooObject {

    private Integer objectNumber;

    private FooObject(Integer objectNumber) {
        this.objectNumber = objectNumber;
    }

    private static FooObject object;

    public static FooObject createObject(Integer objectNumber) {
        if (object == null) object = new FooObject(objectNumber);
        return object;
    }

    @Override
    public String toString() {
        return "Object number: "+objectNumber;
    }
}