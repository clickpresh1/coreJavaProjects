package com.hellogroup.helloartifact;

// import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hey")
    public String hey() {
        String output = "We outside";
        return output;
    } 

    
    
}
