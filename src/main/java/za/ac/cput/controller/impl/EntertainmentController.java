package za.ac.cput.controller.impl;

/**
 * EntertainmentController.java
 * Controller for the Entertainment
 * Author: Andy Hine (219259038)
 * Date: 7 October 2021
 **/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.Entertainment;
import za.ac.cput.service.impl.EntertainmentService;
import java.util.Set;


@RestController
@RequestMapping("/entertainment")
public class EntertainmentController {

    //Attributes
    @Autowired
    private EntertainmentService entertainmentService;

    @GetMapping("/getEntertainment")
    public Set<Entertainment> getEntertainment()
    {
        return this.entertainmentService.getEntertainment();
    }
}
