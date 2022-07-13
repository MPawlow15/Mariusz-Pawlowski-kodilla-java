package com.kodilla.testing.shape;

public class Triangle implements Shape{
    @Override
    public String getShapeName() {

        return "Triangle";
    }

    @Override
    public int getField() {
        return 120;
    }

    @Override
    public String toString() {
        return getShapeName();
    }
}
