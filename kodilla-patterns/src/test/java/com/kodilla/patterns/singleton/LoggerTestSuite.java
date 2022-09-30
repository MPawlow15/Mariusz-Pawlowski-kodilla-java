package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog() {
        //Given
        logger = Logger.INSTANCE;
        logger.log("log");
        //When
        String lastLog = logger.getLastLog();
        //Then
        Assertions.assertEquals("log", lastLog);
    }
}
