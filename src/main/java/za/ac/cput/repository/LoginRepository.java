package za.ac.cput.repository;

/**
 * LoginRepository.java
 * Repository interface for the Login
 * Author: Jason Jaftha (217009301)
 * Date: 22 September 2021
 **/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {
}
