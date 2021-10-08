package za.ac.cput.service.impl;
/**
 * EntertainmentService.java
 * Service for Entertainment
 * Author: Andy Hine(219259038)
 * Date: 23 September 2021
 **/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Entertainment;
import za.ac.cput.repository.EntertainmentRepository;
import za.ac.cput.service.IEntertainmentService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EntertainmentService implements IEntertainmentService {

    private static EntertainmentService service= null;

    @Autowired
    private EntertainmentRepository repository;

    public static EntertainmentService getService() {

        if(service == null)
        {
            service = new EntertainmentService();
        }

        return service;
    }
    @Override
    public Set<Entertainment> getEntertainment() {

        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}
