package com.codsoft.studentmanagementsystem.entity;


public class Student {
    
    private String name,grade,fathername,mothername,section;
    private int rollNo;

    public Student(String name, String grade, String fathername, String mothername, String section, int rollNo) {
        this.name = name;
        this.grade = grade;
        this.fathername = fathername;
        this.mothername = mothername;
        this.section = section;
        this.rollNo = rollNo;
    }

    public Student() {
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

 
   
    
    
    
}
