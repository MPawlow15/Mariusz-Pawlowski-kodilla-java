package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //When
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board boardConfig = context.getBean(Board.class);

        //Given
        boardConfig.getToDoList().getTasks().add("Shopping");
        boardConfig.getDoneList().getTasks().add("Driving");
        boardConfig.getInProgressList().getTasks().add("Walk");
        String resultToDo = boardConfig.getToDoList().getTasks().get(0);
        String resultDone = boardConfig.getDoneList().getTasks().get(0);
        String resultInProgress = boardConfig.getInProgressList().getTasks().get(0);

        //Then
        Assertions.assertEquals("Shopping", resultToDo);
        Assertions.assertEquals("Driving", resultDone);
        Assertions.assertEquals("Walk", resultInProgress);
    }
}
