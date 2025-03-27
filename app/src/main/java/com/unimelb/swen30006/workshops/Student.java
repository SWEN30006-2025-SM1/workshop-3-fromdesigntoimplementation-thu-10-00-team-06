package com.unimelb.swen30006.workshops;

public class Student {
    private String name;
    private String email;
    private int studentID;

    public Student (String _name, String _email, int _studentID) {
        name = _name;
        email = _email;
        studentID = _studentID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getStudentID() {
        return studentID;
    }
}
