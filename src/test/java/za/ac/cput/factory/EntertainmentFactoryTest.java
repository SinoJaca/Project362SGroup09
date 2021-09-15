package za.ac.cput.factory;

/**
 * EntertainmentFactoryTest.java
 * Factory test for Entertainment
 * Author: Andy Hine(219259038)
 * Date: 15 September 2021
 **/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Entertainment;


import static org.junit.jupiter.api.Assertions.*;

class EntertainmentFactoryTest
{
    private Entertainment event;

    @BeforeEach
    void setUp() {

        event =new EntertainmentFactory().createEntertainment("2Majozi and friends at The Clubhouse",
                "Lets enjoy this sunday with fun outside activities", "26 September 2021",
                "12:00 - 16:30", "5 Diamond St,Constantia, Cape Town 7850","R75");
    }

    @Test
    void testCreateEntertainment()
    {
        System.out.println(event);
    }

}