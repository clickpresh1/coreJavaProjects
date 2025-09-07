package com.hellogroup.helloartifact;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {
    
    @RequestMapping("/list")
    public List<String> stringList() {
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("One");
        listOfStrings.add("Two");
        listOfStrings.add("Three");

        return listOfStrings;
    }
}
