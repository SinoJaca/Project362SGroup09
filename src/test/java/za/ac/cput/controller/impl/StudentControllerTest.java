package za.ac.cput.controller.impl;

/**
 * StudentControllerTest.java
 * Test class for the Student controller
 * Author: Jason Jaftha (217009301)
 * Date: 4 October 2021
 **/

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import za.ac.cput.entity.Student;
import za.ac.cput.factory.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StudentControllerTest {

    //Attributes
        private static Student student = StudentFactory.createStudent("231568458", "Niklaus", "Mikelson", "klaismikelson@gmail.com", "0684568501");
        @Autowired
        private TestRestTemplate restTemplate; // A Rest Template
        private final String BASE_URL = "http://localhost:8080/student/saveStudentDetails";

    @Test
    void testSaveStudentDetails()
    {
        System.out.println("URL: " + BASE_URL);
        ResponseEntity<Boolean> postResponse = restTemplate.postForEntity(BASE_URL, student, Boolean.class);

        assertNotNull(postResponse);
    }
}