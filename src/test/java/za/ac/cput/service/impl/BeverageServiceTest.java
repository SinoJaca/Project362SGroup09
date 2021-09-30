package za.ac.cput.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Beverage;
import za.ac.cput.factory.BeverageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class BeverageServiceTest{
    @Autowired
    private BeverageService service = BeverageService.getService();
    private Beverage bev;

    @BeforeEach
    public void setUp() {

        bev = BeverageFactory.createBeverage("Hot chocolate", "Hot Drinks", 25);
    }
    @Test
    void testCreateBeverage()
    {
        assertTrue(service.saveBeverage(bev));
        System.out.println(bev);
    }


}