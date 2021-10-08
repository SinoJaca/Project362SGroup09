package za.ac.cput.service;

/**
 * IStudentService.java
 * Service interface for the Student
 * Author: Jason Jaftha (217009301)
 * Date: 22 September 2021
 **/

import za.ac.cput.entity.Student;

public interface IStudentService {

    boolean saveStudentDetails(Student student);
}
