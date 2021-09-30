package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Beverage;
import za.ac.cput.repository.BeverageRepository;
import za.ac.cput.service.IBeverageService;


@Service
public class BeverageService implements IBeverageService {
    @Autowired
    private static BeverageService service=null;
    private BeverageRepository repository;

    public static BeverageService getService() {
        if(service==null) {service= new BeverageService();}

        return service;
    }
    @Override
    public boolean saveBeverage(Beverage beverage) {
        if (beverage != null) {
            this.repository.save(beverage);
            return true;
        }

        return false;
    }
}
