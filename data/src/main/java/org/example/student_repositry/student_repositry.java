package org.example.student_repositry;
import org.example.student.student;

import static org.example.logging.logging.logger;


public class student_repositry {
private student[] students;
private int index;
private int capacity;
public student_repositry(int size) {
    students = new student[size];
    index = 0;
    capacity = size;
}
public void add_student(student stu) {
    if(index<capacity){
        students[index]=stu;
        index++;
        logger.info("added a student in repositry");
    }
    else{
        System.out.println("capacity is full");
        logger.warn("capacity is full");
    }
}
public student get_student(int id){
    for(int i=0;i<index;i++){
        if(students[i].getId()==id){
            return students[i];
        }
    }
    return null;
}
public student get_student(String name){
    for(int i=0;i<index;i++){
        if(students[i].getName().equals(name))
            return students[i];
    }
    return null;
}
public void remove_student(int id) {
    for(int i=0;i<index;i++){
        if(students[i].getId()==id){
            students[i]=students[index-1];
            students[index-1]=null;
            index--;
        }
    }
}
}
