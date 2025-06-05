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
public class StudentResult {
    private String StudentName;
    private int StudentID;
    private String class_st;
    private Date BirthDay;
    private float Points;
    private String Topic;
    private String Course;

    public StudentResult() {
    }

    
    public StudentResult(String StudentName, int StudentID, String class_st, Date BirthDay, float Points, String Topic, String Course) {
        this.StudentName = StudentName;
        this.StudentID = StudentID;
        this.class_st = class_st;
        this.BirthDay = BirthDay;
        this.Points = Points;
        this.Topic = Topic;
        this.Course = Course;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public String getClass_st() {
        return class_st;
    }

    public void setClass_st(String class_st) {
        this.class_st = class_st;
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

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }
    
}
