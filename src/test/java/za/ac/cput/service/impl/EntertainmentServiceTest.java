package za.ac.cput.service.impl;

/**
 * EntertainmentServiceTest.java
 * Test for EntertainmentService
 * Author: Andy Hine(219259038)
 * Date: 23 September 2021
 **/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Entertainment;
import za.ac.cput.factory.EntertainmentFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EntertainmentServiceTest {

    @Autowired
    private EntertainmentService service = EntertainmentService.getService();
    private Entertainment entertainment;

    @BeforeEach
    void setUp() {

        entertainment =new EntertainmentFactory().createEntertainment("2Majozi and friends at The Clubhouse",
                "Lets enjoy this sunday with fun outside activities", "26 September 2021",
                "12:00 - 16:30", "5 Diamond St,Constantia, Cape Town 7850","R75");
    }

    @Test
    void testCreateEntertainment() {assertTrue(service.saveEntertainment(entertainment));
    }
    }