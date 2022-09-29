package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest(classes = com.kodilla.spring.calculator.Display.class)
public class CalculatorTestSuite {

    @Test
    void testCalculationsAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.add(2,3);

        //Then
        Assertions.assertEquals(5, result);
    }

    @Test
    void testCalculationsSub() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.sub(3,2);

        //Then
        Assertions.assertEquals(1, result);
    }

    @Test
    void testCalculationsMul() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.mul(2,3);

        //Then
        Assertions.assertEquals(6, result);
    }

    @Test
    void testCalculationsDiv() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.div(4,2);

        //Then
        Assertions.assertEquals(2, result);
    }
}
