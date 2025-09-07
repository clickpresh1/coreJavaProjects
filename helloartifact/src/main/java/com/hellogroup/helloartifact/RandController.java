package com.hellogroup.helloartifact;

import java.security.SecureRandom;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandController {
    SecureRandom randomNumber = new SecureRandom();
    
    @RequestMapping("/rand")
    public String randString() {
        int rand = 1 + randomNumber.nextInt(3);
        String randOutputString = null;
        switch (rand) {
            case 1:
                randOutputString = "One";
                break;
            case 2:
                randOutputString = "Two";
                break;
            case 3:
                randOutputString = "Three";
                break;
        } 
        
        return randOutputString;
    }
}
