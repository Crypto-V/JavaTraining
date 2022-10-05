package com.studentDatabase;

public class StudentDBApp {
    public static void main(String[] args) {
        StudentFactory stu1 = new StudentFactory("Jack", "234567890");
        StudentFactory stu2 = new StudentFactory("Jhon", "232367880");
        stu1.enroll("Math 151");
        stu1.enroll("English 131");

        stu1.payTuition(500);
        stu1.checkBalance();
        stu1.setCity("Telenesti");
        stu1.setState("Telenesti");
        stu1.setPhonne("757689455");
        stu1.showCourses();
        System.out.println(stu1.getCity());
        System.out.println(stu1.getEmail());
        System.out.println(stu1.getState());
        System.out.println(stu1.getPhonne());

        System.out.println(stu1.toString());
        System.out.println(stu2.toString());

    }
}

