package za.ac.cput.factory;

/**
 * StudentFactoryTest.java
 * Test class which test the Student entity and factory class
 * Author: Jason Jaftha (217009301)
 * Date: 13 September 2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    //Attributes
        private Student student;

    @BeforeEach
    void setUp() {

        student =new StudentFactory().createStudent("217009301", "Jon", "Snow", "jonsnow@gmail.com", "0768426978");
    }

    @Test
    void testCreateStudent()
    {
        System.out.println(student);
    }
}