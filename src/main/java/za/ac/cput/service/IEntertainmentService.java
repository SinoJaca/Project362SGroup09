package za.ac.cput.service;

import za.ac.cput.entity.Entertainment;

import java.util.Set;

/**
 * IEntertainmentService.java
 * Service for IEntertainment interface
 * Author: Andy Hine(219259038)
 * Date: 23 September 2021
 **/

public interface IEntertainmentService {

    Set<Entertainment> getEntertainment();
}
