package com.hellogroup.helloartifact;

public class Student {
    private String name;
    private String course;
    private String school;

    public Student() {
    }

    public Student(String name, String course, String school) {
        this.name = name;
        this.course = course;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    } 

    
}
