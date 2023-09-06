package com.reetesh.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/name")
    public String getName(){
        return "Reetesh Motwani";
    }

    @GetMapping("/age")
    public String getAge(){
        return "25";
    }

    @GetMapping("/address")
    public String getAddress(){
        return "Pune";
    }
}
