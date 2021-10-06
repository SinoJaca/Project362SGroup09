package za.ac.cput.service.impl;

/**
 * FoodServiceTest.java
 * Test class for the Food service
 * Author: Jason Jaftha (217009301)
 * Date: 6 October 2021
 */

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Food;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FoodServiceTest {

    @Autowired
    private FoodService service = FoodService.getService();
    private Set<Food> foodList;

    @Test
    void testFoodList()
    {
        foodList = service.getFoodList();

        for(Food f : foodList)
        {
            System.out.println(f.toString());
        }
    }
}