package za.ac.cput.controller;

/**
 * HomeController.java
 * Controller for the home directory
 * Author: Jason Jaftha (217009301)
 * Date: 4 October 2021
 **/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Home page

@RestController // Provides rest services
public class HomeController {

    @RequestMapping({"/", "/home"}) //Specify the path/url to reach the home page | localhost:8080/ or localhost:8080/home.
    public String home()
    {
        return "<<< Welcome to our Project362SGroup09 Application >>>";
    }
}
