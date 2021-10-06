package za.ac.cput.service;

/**
 * IFoodSevice.java
 * Service interface for the Food entity
 * Author: Jason Jaftha (217009301)
 * Date: 6 October 2021
 */

import za.ac.cput.entity.Food;

import java.util.Set;

public interface IFoodService {

    Set<Food> getFoodList();
}
