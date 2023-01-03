package com.example.kodillapatterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Pizza", description);
    }

    @Test
    void testPizzaWithAllToppingsDeliveryGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AddonHamDecorator(pizzaOrder);
        pizzaOrder = new AddonSauceDecorator(pizzaOrder);
        pizzaOrder = new AddonExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new DeliveryDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Pizza + ham + sauce + extra cheese + delivery", description);
    }

    @Test
    void testPizzaWithAllToppingsDeliveryGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AddonHamDecorator(pizzaOrder);
        pizzaOrder = new AddonSauceDecorator(pizzaOrder);
        pizzaOrder = new AddonExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new DeliveryDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        System.out.println(cost);
        //Then
        assertEquals(new BigDecimal(43.0), cost);
    }

}
