package com.parkingspace;

public class SpotMonthlyUser {

    private String month;
    private int count;
    private String parkingSpotName; // Changed to parkingSpotName
    private int year;

    public SpotMonthlyUser(String month, int count, String parkingSpotName, int year) {
        this.month = month;
        this.count = count;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
