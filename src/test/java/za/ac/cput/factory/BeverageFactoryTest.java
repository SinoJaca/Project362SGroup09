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

    Beverage bev1,bev2;

    @BeforeEach
    public void setUp() {

        bev1= new BeverageFactory().createBeverage("Stoney", "Soft Drinks",27.00);
        bev2= new BeverageFactory().createBeverage("Black coffee", "Caffeinated drinks", 22.00);



    }
    @Test
    public void testBeverageEquality() {
        System.out.println(bev1.toString());
        System.out.println(bev2.toString());
        assertNotEquals(bev1, bev2);
    }

    @Test
    void testBeverageIdentity() {
        System.out.println("Bev1 and Bev2 are not the same");
        assertNotSame(bev1, bev2);
    }







}
