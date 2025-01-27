package com.parkingspace;

import java.math.BigDecimal;

public class SpotMonthlyIncome {

    private String month;
    private BigDecimal income;
    private String parkingSpotName; // Changed to parkingSpotName
    private int year;

    public SpotMonthlyIncome(String month, BigDecimal income, String parkingSpotName, int year) {
        this.month = month;
        this.income = income;
        this.parkingSpotName = parkingSpotName; // Changed to parkingSpotName
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

    public String getParkingSpotName() { // Changed to parkingSpotName
        return parkingSpotName;
    }

    public void setParkingSpotName(String parkingSpotName) { // Changed to parkingSpotName
        this.parkingSpotName = parkingSpotName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
