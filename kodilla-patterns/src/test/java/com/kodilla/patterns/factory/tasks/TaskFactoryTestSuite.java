package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        Assertions.assertEquals("Driving", driving.getTaskName());
        Assertions.assertEquals(true, driving.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        Assertions.assertEquals("Painting", painting.getTaskName());
        Assertions.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assertions.assertEquals("Shopping", shopping.getTaskName());
        Assertions.assertEquals(true, shopping.isTaskExecuted());
    }
}