package za.ac.cput.service.impl;

/**
 * FoodRepository.java
 * Service implementation for the Food entity
 * Author: Jason Jaftha (217009301)
 * Date: 6 October 2021
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Food;
import za.ac.cput.repository.FoodRepository;
import za.ac.cput.service.IFoodService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FoodService implements IFoodService {

    @Autowired
    private FoodRepository repository;
    private static FoodService service;

    public static FoodService getService()
    {
        if(service == null)
        {
            service = new FoodService();
        }

        return service;
    }


    //Get list of food items
    @Override
    public Set<Food> getFoodList() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    //Add foodId and quantity to the invoice/invoiceLine??

}
