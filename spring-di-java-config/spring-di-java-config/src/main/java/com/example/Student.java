package com.example;

public class Student {
    private final Course course;

    // Constructor Injection
    public Student(Course course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student details:");
        course.displayCourse();
    }
}
