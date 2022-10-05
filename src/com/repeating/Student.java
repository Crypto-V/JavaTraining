package com.repeating;

public class Student {
    String firstName;
    String lastName;
    int exptYearToGraduate;
    double gpa;
    String Major;

    public Student(String firstName, String lastName, int exptYearToGraduate, double gpa, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.exptYearToGraduate = exptYearToGraduate;
        this.gpa = gpa;
        Major = major;
    }

    public void incrementExpectedYear() {
        this.exptYearToGraduate++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", exptYearToGraduate=" + exptYearToGraduate +
                ", gpa=" + gpa +
                ", Major='" + Major + '\'' +
                '}';
    }
}
