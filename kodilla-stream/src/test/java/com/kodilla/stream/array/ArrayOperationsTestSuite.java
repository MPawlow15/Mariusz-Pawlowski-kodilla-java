package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
        }

        //When
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + numbers[i];
        }
        double expectedAverage = sum / 10;

        //Then
        assertEquals(expectedAverage, ArrayOperations.getAverage(numbers));
    }
}
