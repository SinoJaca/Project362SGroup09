package za.ac.cput.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.Food;
import za.ac.cput.service.impl.FoodService;

import java.util.Set;

/**
 * FoodController.java
 * Controller for the Food Service
 * Author: Jason Jaftha (217009301)
 * Date: 6 October 2021
 **/

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService service;

    @GetMapping("/getFoodList")
    public Set<Food> getFoodList()
    {
        return this.service.getFoodList();
    }
}
