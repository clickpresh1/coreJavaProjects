package com.hellogroup.helloartifact;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private List<Student> studentList = Arrays.asList(new Student("Jane", "Math", "Yale"), new Student("Tim", "History", "Duke"), new Student("Leonard", "CS", "Harvard"));


    public List<Student> getStudentList() {
        return studentList;
    }
    
}
