package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Shape;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {

        return switch (taskClass) {
            case DRIVING -> new DrivingTask("Driving", "Warsaw", "Car");
            case PAINTING -> new PaintingTask("Painting", "Blue", "Room");
            case SHOPPING -> new ShoppingTask("Shopping", "Shoes", 2);
            default -> null;
        };
    }
}
