package za.ac.cput.factory;

/**
 * FoodFactoryTest.java
 * Test class for the Food and FoodFactory
 * Author: Jason Jaftha (217009301)
 * Date: 6 October 2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Food;

import static org.junit.jupiter.api.Assertions.*;

class FoodFactoryTest {

    private static Food food;

    @BeforeEach
    void setUp() {

        food = FoodFactory.createFood(102, "Pizza", "Takeaways", 169.99);
    }

    @Test
    void testFood()
    {
        System.out.println(food.toString());
    }
}