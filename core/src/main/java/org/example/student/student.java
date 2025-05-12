package org.example.student;

public class student {
    private int id;
    private String name;
    private int age;
    private char grade;
    public student(int id, String name, int age, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    public void print_student_info() {
        System.out.println("id: " + id + " name: " + name + " age: " + age + " grade: " + grade);
        return;
    }
}
