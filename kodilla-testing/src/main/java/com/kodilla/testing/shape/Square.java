package com.kodilla.testing.shape;

public class Square implements Shape{
    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public int getField() {
        return 230;
    }

    @Override
    public String toString() {
        return getShapeName();
    }
}
