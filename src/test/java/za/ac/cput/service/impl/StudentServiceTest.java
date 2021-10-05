package za.ac.cput.service.impl;

/**
 * StudentServiceTest.java
 * Test class which test the Student Service class
 * Author: Jason Jaftha (217009301)
 * Date: 22 September 2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Student;
import za.ac.cput.factory.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {

    //Attributes
        @Autowired
        private StudentService service = StudentService.getService();
        private Student student;

    @BeforeEach
    void setUp() {

        student = StudentFactory.createStudent("217009301", "Jon", "Snow", "jonsnow@gmail.com", "0768426978");
    }

    @Test
    void testSaveStudentDetails()
    {
        assertTrue(service.saveStudentDetails(student));
    }
}