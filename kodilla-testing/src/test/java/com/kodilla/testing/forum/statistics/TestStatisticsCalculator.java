package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestStatisticsCalculator {

    private Statistics statisticsMock;
    private StatisticsCalculator statisticsCalculator;


    @BeforeEach
    public void beforeTest(){
        statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        statisticsCalculator = new StatisticsCalculator();
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsCalculator.getPostsQty());
        assertEquals(0, statisticsCalculator.getPostsAvgPerUser(), 0.01);
        assertEquals(0, statisticsCalculator.getCommentsAvgPerPost(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsWithThousandPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, statisticsCalculator.getPostsQty());
        assertEquals(100, statisticsCalculator.getPostsAvgPerUser(), 0.01);
        assertEquals(0.04, statisticsCalculator.getCommentsAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroComments(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsCalculator.getCommentsQty());
        assertEquals(0, statisticsCalculator.getCommentsAvgPerUser(), 0.01);
        assertEquals(0, statisticsCalculator.getCommentsAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10, statisticsCalculator.getPostsQty());
        assertEquals(2, statisticsCalculator.getCommentsQty());
        assertEquals(1, statisticsCalculator.getPostsAvgPerUser(), 0.01);
        assertEquals(0.2, statisticsCalculator.getCommentsAvgPerUser(), 0.01);
        assertEquals(0.2, statisticsCalculator.getCommentsAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(20, statisticsCalculator.getPostsQty());
        assertEquals(40, statisticsCalculator.getCommentsQty());
        assertEquals(2, statisticsCalculator.getPostsAvgPerUser(), 0.01);
        assertEquals(4, statisticsCalculator.getCommentsAvgPerUser(), 0.01);
        assertEquals(2, statisticsCalculator.getCommentsAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroUsers(){
        //Given
        List<String> listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsCalculator.getUsersQty());
        assertEquals(0, statisticsCalculator.getPostsAvgPerUser(), 0.01);
        assertEquals(0, statisticsCalculator.getCommentsAvgPerUser(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsWithHundredUsers(){
        //Given
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, statisticsCalculator.getUsersQty());
        assertEquals(0.2, statisticsCalculator.getPostsAvgPerUser(), 0.01);
        assertEquals(0.4, statisticsCalculator.getCommentsAvgPerUser(), 0.01);

    }
}

