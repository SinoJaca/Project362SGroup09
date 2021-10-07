package za.ac.cput.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.Beverage;
import za.ac.cput.service.impl.BeverageService;


import java.util.Set;
@RestController
@RequestMapping("/beverage")
public class BeverageController {

   @Autowired
   private BeverageService service;

   @GetMapping("/getBeverageList")
   public Set<Beverage> getBeverageList() {
       return this.service.getBeverageList();
   }

}
