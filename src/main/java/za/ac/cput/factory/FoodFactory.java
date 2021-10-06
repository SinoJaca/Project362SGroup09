package za.ac.cput.factory;

/**
 * FoodFactory.java
 * Factory for the Food entity
 * Author: Jason Jaftha (217009301)
 * Date: 6 October 2021
 */

import za.ac.cput.entity.Food;

public class FoodFactory {

    public static Food createFood(int foodId, String name, String category, double price)
    {
        return new Food.Builder().setFoodId(foodId)
                                 .setName(name)
                                 .setCategory(category)
                                 .setPrice(price)
                                 .build();
    }
}
