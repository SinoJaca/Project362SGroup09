package za.ac.cput.factory;

import za.ac.cput.entity.Beverage;

/*
    BeverageFactory.java
    beverage Factory
    Author: Nonhlahla Hlungwani (218160658)
    Date: 14 September 2021
 */
public class BeverageFactory {
    private static int bevCode =1;
    public static Beverage createBeverage(String bevName, String category, double price) {

        return new Beverage.Builder()
                .setBevCode(++bevCode)
                .setBevName(bevName)
                .setCategory(category)
                .setPrice(price)
                .build();


    }
}
