package com.example.mybatis.student;

import com.example.mybatis.Card.Card;

import javax.swing.*;

public class student {
    private int id;
    private String name;
    private String grade;
    private String major;
    private String sex;

    private Card card;
    public student(int id, String name, String grade, String major, String sex) {
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.major=major;
        this.sex=sex;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                ", sex='" + sex + '\'' +
                ", card=" + card +
                '}';
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
