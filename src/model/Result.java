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
public class Result {
    private int ResultID;
    private Date ResultDate;
    private float Points;
    private int TestID;
    private int StudentID;

    public Result() {
    }

    public Result(int ResultID, Date ResultDate, float Points, int TestID, int StudentID) {
        this.ResultID = ResultID;
        this.ResultDate = ResultDate;
        this.Points = Points;
        this.TestID = TestID;
        this.StudentID = StudentID;
    }

    public int getResultID() {
        return ResultID;
    }

    public void setResultID(int ResultID) {
        this.ResultID = ResultID;
    }

    public Date getResultDate() {
        return ResultDate;
    }

    public void setResultDate(Date ResultDate) {
        this.ResultDate = ResultDate;
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

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }
    
    
}
