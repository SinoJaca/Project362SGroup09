package za.ac.cput.factory;

/**
 * LoginFactoryTest.java
 * Test class which test the Login entity and factory class
 * Author: Jason Jaftha (217009301)
 * Date: 13 September 2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Login;

import static org.junit.jupiter.api.Assertions.*;

class LoginFactoryTest {

    //Attributes
        private Login login;

    @BeforeEach
    void setUp() {

        login = new LoginFactory().createLogin("217009301", "jonsnow", "Password01");
    }

    @Test
    void testCreateLogin()
    {
        System.out.println(login);
    }
}