package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTestSuite {

    @Test
    public void testProbablyIWillThrowException() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        //When & Then
        assertDoesNotThrow(() -> exceptionHandling.probablyIWillThrowException(2,1.5));
    }

}
