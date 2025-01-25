package com.parkingspace;

import java.math.BigDecimal;

public class  SpotMonthlyIncome{

    private String month;
    private BigDecimal income;
    private String spotName;
    private int year;

    public SpotMonthlyIncome(String month, BigDecimal income, String spotName, int year) {
        this.month = month;
        this.income = income;
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

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
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
