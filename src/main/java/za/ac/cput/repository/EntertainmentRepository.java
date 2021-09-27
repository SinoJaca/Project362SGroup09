package za.ac.cput.repository;

/**
 * EntertainmentRepository.java
 * Repository for Entertainment
 * Author: Andy Hine(219259038)
 * Date: 23 September 2021
 **/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Entertainment;

@Repository
public interface EntertainmentRepository extends JpaRepository<Entertainment,Integer>{
}
