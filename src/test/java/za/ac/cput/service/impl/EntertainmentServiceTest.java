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
import java.util.Set;



@SpringBootTest
class EntertainmentServiceTest {

    @Autowired
    private EntertainmentService service = EntertainmentService.getService();
    private Set<Entertainment> entertainmentList;


    @Test
    void testCreateEntertainment() {
        entertainmentList = service.getEntertainment();

        for(Entertainment e: entertainmentList)
        {
            System.out.println(e.toString());
        }
    }

    }