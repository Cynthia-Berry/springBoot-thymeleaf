package com.example.form.models;

import java.util.Set;

public class User {

    private String name;
    private String school;
    private String bestSubject;

    private Set<Work> work;

    public User(String name, String school, String bestSubject, Set<Work> workDetails) {
        this.name = name;
        this.school = school;
        this.bestSubject = bestSubject;
        this.work = workDetails;
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

    public Set<Work> getWork() {
        return work;
    }

    public void setWork(Set<Work> work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", bestSubject='" + bestSubject + '\'' +
                ", work=" + work +
                '}';
    }
}
