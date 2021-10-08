package za.ac.cput.repository;

/**
 * StudentRepository.java
 * Repository interface for the Student
 * Author: Jason Jaftha (217009301)
 * Date: 22 September 2021
 **/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
