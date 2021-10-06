package za.ac.cput.repository;

/**
 * FoodRepository.java
 * Repository for the Food entity
 * Author: Jason Jaftha (217009301)
 * Date: 6 October 2021
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {

}
