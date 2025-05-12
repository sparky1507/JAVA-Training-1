package org.example;

import org.example.student.student;
import org.example.student_repositry.student_repositry;


public class Main {
    public static void main(String[] args) {
        student student1 = new student(1,"Harsh",23,'A');
        student student2 = new student(2,"Yash",23,'A');
        student_repositry repositry = new student_repositry(2);
        repositry.add_student(student1);
        repositry.add_student(student2);
        student s=repositry.get_student(2);
        student r=repositry.get_student("Yash");
        s.print_student_info();
        r.print_student_info();
        repositry.remove_student(2);
        r=repositry.get_student("Yash");
    }
}