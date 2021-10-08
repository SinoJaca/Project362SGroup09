package za.ac.cput.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Beverage;
import za.ac.cput.factory.BeverageFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class BeverageServiceTest{
    @Autowired
    private BeverageService service = BeverageService.getService();
    private Set<Beverage> beverageList;

    @Test
    void testBeverageList()
    {
        beverageList = service.getBeverageList();

        for(Beverage bev : beverageList) {
            System.out.println(bev.toString());
        }
    }


}