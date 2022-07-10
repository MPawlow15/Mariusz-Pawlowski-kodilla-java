package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Checking if the list is empty")

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = OddNumbersExterminator.exterminate(emptyList);
        //Then
        System.out.println("Testing empty list");

        Assertions.assertEquals(emptyList, resultList);
    }

    @DisplayName("should only add even numbers to the list")

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(2);
        normalList.add(4);
        normalList.add(5);
        normalList.add(10);
        normalList.add(6);

        ArrayList<Integer>expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(2);
        expectedResultList.add(4);
        expectedResultList.add(10);
        expectedResultList.add(6);

        //When
        List<Integer> resultList =OddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");
        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }
}
