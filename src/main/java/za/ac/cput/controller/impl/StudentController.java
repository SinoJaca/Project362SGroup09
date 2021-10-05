package za.ac.cput.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.Student;
import za.ac.cput.service.impl.StudentService;

/**
 * StudentController.java
 * Controller for the Student Service
 * Author: Jason Jaftha (217009301)
 * Date: 4 October 2021
 **/

@RestController
@RequestMapping("/student")
public class StudentController {

    //Attributes
        @Autowired
        private StudentService studentService;

    @PostMapping("/saveStudentDetails")
    public boolean saveStudentDetails(@RequestBody Student student)
    {
        return this.studentService.saveStudentDetails(student);
    }
}
