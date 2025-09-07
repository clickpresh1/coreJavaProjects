package com.hellogroup.helloartifact;

// import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/studentlist")
    public List<Student> studentListMethod() {
        // ArrayList<Student> studentList = new ArrayList<>();
        // studentList.add(new Student("Jane", "Math", "Yale"));
        // studentList.add(new Student("Tim", "History", "Duke"));
        // studentList.add(new Student("Leonard", "CS", "Harvard")); 

        return studentService.getStudentList();
    }
}
