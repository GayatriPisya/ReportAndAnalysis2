package com.parkingspace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "http://localhost:4200")
public class ReportController {

    @Autowired
    private ReportService reportService;

    // Get monthly user counts grouped by spot for a specific year
    @GetMapping("/spot-monthly-users/{year}")
    public List<SpotMonthlyUser> getSpotMonthlyUsers(@PathVariable int year) {
        List<SpotMonthlyUser> userCounts = reportService.getSpotMonthlyUserCounts(year);
        if (userCounts.isEmpty()) {
            System.out.println("No data found for monthly user counts for year: " + year);
        }
        return userCounts;
    }

    // Get monthly income grouped by spot for a specific year
    @GetMapping("/spot-monthly-income/{year}")
    public List<SpotMonthlyIncome> getSpotMonthlyIncome(@PathVariable int year) {
        List<SpotMonthlyIncome> monthlyIncome = reportService.getSpotMonthlyIncome(year);
        if (monthlyIncome.isEmpty()) {
            System.out.println("No data found for monthly income for year: " + year);
        }
        return monthlyIncome;
    }

    @GetMapping("/available-years")
    public List<Integer> getAvailableYears() {
        return reportService.getAvailableYears(); // Call service to fetch available years
    }
}
