/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Student {
    private int StudentID;
    private String StudentName, class_st, Address;
    private Date BirthDay;
    private float Points;
    private int TestID;
    private Date ResultDate; 
    public Student() {
    }

    public Student(int StudentID, String StudentName, String class_st, String Address, Date BirthDay, float Points, int TestID, Date ResultDate) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.class_st = class_st;
        this.Address = Address;
        this.BirthDay = BirthDay;
        this.Points = Points;
        this.TestID = TestID;
        this.ResultDate = ResultDate;
    }

    public Student(int StudentID, String StudentName, String class_st, String Address, Date BirthDay) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.class_st = class_st;
        this.Address = Address;
        this.BirthDay = BirthDay;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getClass_st() {
        return class_st;
    }

    public void setClass_st(String class_st) {
        this.class_st = class_st;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(Date BirthDay) {
        this.BirthDay = BirthDay;
    }

    public float getPoints() {
        return Points;
    }

    public void setPoints(float Points) {
        this.Points = Points;
    }

    public int getTestID() {
        return TestID;
    }

    public void setTestID(int TestID) {
        this.TestID = TestID;
    }

    public Date getResultDate() {
        return ResultDate;
    }

    public void setResultDate(Date ResultDate) {
        this.ResultDate = ResultDate;
    }
    
    
}
