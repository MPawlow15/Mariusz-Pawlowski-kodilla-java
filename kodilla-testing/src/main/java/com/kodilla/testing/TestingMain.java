package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
public class TestingMain {

    public static void main(String[] args) {
        Calculator simpleCalculator = new Calculator();

        int addResult = simpleCalculator.add(1,2);
        int subtractionResult = simpleCalculator.subtract(4,2);

        if (addResult == 3) {
            System.out.println("test 1  OK");
        } else {
            System.out.println("Error!");
        }

        if (subtractionResult == 2) {
            System.out.println("test 2  OK");
        } else {
            System.out.println("Error!");
        }

    }
}
