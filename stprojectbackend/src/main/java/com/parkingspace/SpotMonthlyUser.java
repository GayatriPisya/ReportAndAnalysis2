package com.parkingspace;

public class SpotMonthlyUser {

    private String month;
    private int count;
    private String spotName;
    private int year;

    public SpotMonthlyUser(String month, int count, String spotName, int year) {
        this.month = month;
        this.count = count;
        this.spotName = spotName;
        this.year = year;
    }

    // Getters and Setters
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
