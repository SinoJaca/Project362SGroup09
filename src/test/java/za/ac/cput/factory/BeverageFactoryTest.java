package za.ac.cput.factory;
/*
    BeverageFactoryTest.java
    beverage Factory Test
    Author: Nonhlahla Hlungwani (218160658)
    Date: 14 September 2021
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Beverage;

import static org.junit.jupiter.api.Assertions.*;

class BeverageFactoryTest {

   private static Beverage beverage,beverage1;

    @BeforeEach
    public void setUp() {

        beverage = BeverageFactory.createBeverage(232,"Stoney", "Soft Drinks",27.00);
        beverage1 = BeverageFactory.createBeverage(343, "Black coffee", "Caffeinated drinks", 22.00);



    }
    @Test
    public void testBeverageEquality() {
        System.out.println(beverage.toString());
        System.out.println(beverage1.toString());
        assertNotEquals(beverage, beverage1);
    }

}
