package com.example.demo.Student;

import java.time.LocalDate;

public class student {
    private long id;
    private String name;
    private LocalDate dob;
    private String email;
    private int age;

    public student(long id, String name, LocalDate dob, String email, int age){
        this.age = age;
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public student(){
        
    }

    public student(String name, LocalDate dob, String email, int age){
        this.age = age;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

       // Getter and Setter for id
       public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for dob
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Student{" + "id="+id +"nama=" + name +"email=" + email+"age="+age+"localdate="+dob;
    }
    
}
