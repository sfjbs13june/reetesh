package com.reetesh.app.controllerr;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/getstudent")
    public String getStudent(){
        return "Reetesh";
    }

    @PutMapping("/updatestudent")
    public String updateStudent(){
        return "Updated Student Successfully";
    }

    @DeleteMapping("/deletestudent")
    public String deleteStudent(){
        return "Deleted Student Successfully";
    }
}
