package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Shape Test Suite ")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testAddFigure() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector();

        //When
        shapeCollection.addFigure(new Triangle());

        //Then
        Assertions.assertEquals(1, shapeCollection.getFigureQuantity());
    }

    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector();
        Shape triangle = new Triangle();
        shapeCollection.addFigure(triangle);

        //When
        shapeCollection.removeFigure(triangle);

        //Then
        Assertions.assertEquals(0, shapeCollection.getFigureQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector();
        shapeCollection.addFigure(new Triangle());

        //When
        String retrievedShape = shapeCollection.getFigure(0).getShapeName();



        //Then
        Assertions.assertEquals("Triangle", retrievedShape);

    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector();
        shapeCollection.addFigure(new Triangle());
        shapeCollection.addFigure(new Square());
        shapeCollection.addFigure(new Circle());

        //When
        shapeCollection.showFigures();
        String retrievedShape = String.valueOf(shapeCollection.getFigure(1));
        boolean isEqual = "Square" == retrievedShape;

        //Then
        Assertions.assertEquals(3, shapeCollection.getFigureQuantity());

        Assertions.assertTrue(isEqual);
    }
}


