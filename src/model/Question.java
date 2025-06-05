/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Question {
    private int questionID;
    private String questionContent;
    private int topicID;
    private int questionLevel;
    private int index;

    public Question() {
    }

    public Question(int index, int questionID, String questionContent, int topicID, int questionLevel) {
        this.questionID = questionID;
        this.questionContent = questionContent;
        this.topicID = topicID;
        this.questionLevel = questionLevel;
        this.index = index;
    }

    public Question(int questionID, String questionContent, int topicID, int questionLevel) {
        this.questionID = questionID;
        this.questionContent = questionContent;
        this.topicID = topicID;
        this.questionLevel = questionLevel;
    }

    
    
    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public int getTopicID() {
        return topicID;
    }

    public void setTopicID(int topicID) {
        this.topicID = topicID;
    }

    public int getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(int questionLevel) {
        this.questionLevel = questionLevel;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
}
