package com.example.form.models;

import java.util.Set;

public class User {

    private String name;
    private String school;
    private String bestSubject;
    private Work work = new Work();

    public User(String name, String school, String bestSubject, Work work) {
        this.name = name;
        this.school = school;
        this.bestSubject = bestSubject;
        this.work = work;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getBestSubject() {
        return bestSubject;
    }

    public void setBestSubject(String bestSubject) {
        this.bestSubject = bestSubject;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", bestSubject='" + bestSubject + '\'' +
                ", work { " +'\'' +
                work + '\'' +
                " }" +
                '}';
    }
}
