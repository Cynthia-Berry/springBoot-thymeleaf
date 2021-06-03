package com.example.form.models;

public class Work {
    private Work work = new Work();
    private String companyName;
    private String faxNumber;
    private String location;

    public Work() {
    }

    public Work(String companyName, String faxNumber, String location) {
        this.companyName = companyName;
        this.faxNumber = faxNumber;
        this.location = location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Work{" +
                "companyName='" + companyName + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
