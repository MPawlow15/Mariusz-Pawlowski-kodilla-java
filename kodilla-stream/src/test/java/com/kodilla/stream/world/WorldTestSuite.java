package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        Country poland = new Country(new BigDecimal("38000000"));
        Country hungry = new Country(new BigDecimal("9750000"));
        Country czech = new Country(new BigDecimal("10700000"));
        Country egypt = new Country(new BigDecimal("102300000"));

        List<Country> polandList = new ArrayList<>();
        polandList.add(poland);

        List<Country> hungryList = new ArrayList<>();
        hungryList.add(hungry);
        List<Country> czechList = new ArrayList<>();
        czechList.add(czech);
        List<Country> egyptList = new ArrayList<>();
        egyptList.add(egypt);

        Continent poland1 = new Continent(polandList);
        Continent hungry1 = new Continent(hungryList);
        Continent czech1 = new Continent(czechList);
        Continent egypt1 = new Continent(egyptList);

        List<Continent> worldList = new ArrayList<>();
        worldList.add(poland1);
        worldList.add(hungry1);
        worldList.add(czech1);
        worldList.add(egypt1);

        World world = new World(worldList);
        //when
        BigDecimal peopleFromWorld = world.getPeopleQuantity();
        //then
        Assertions.assertEquals(new BigDecimal("160750000"), peopleFromWorld);

    }
}
