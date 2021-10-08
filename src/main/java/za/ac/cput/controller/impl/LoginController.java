package za.ac.cput.controller.impl;

/**
 * LoginController.java
 * Controller for the Login Service
 * Author: Jason Jaftha (217009301)
 * Date: 4 October 2021
 **/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.service.impl.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

    //Attributes
        @Autowired
        private LoginService loginService;

    @PostMapping("/getLoginDetails")
    public boolean getLoginDetails(@RequestParam("username") String username, @RequestParam("password") String password)
    {
        return this.loginService.getLoginDetails(username, password);
    }

}
