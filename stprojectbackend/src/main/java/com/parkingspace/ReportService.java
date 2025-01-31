package com.parkingspace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportService {

    @Autowired
    private PaymentRepository paymentRepository;

    // Fetch monthly user data grouped by month
    public List<SpotMonthlyUser> getSpotMonthlyUserCounts(int year) {
        List<Object[]> results = paymentRepository.findMonthlyUserCountsByYear(year);
        return results.stream()
                .map(row -> new SpotMonthlyUser(
                        getMonthName((Integer) row[0]), // Convert month number to name
                        ((Long) row[1]).intValue(), // User count
                        null, // Ignore parking spot name for user count report
                        year))
                .collect(Collectors.toList());
    }

    // Fetch monthly income grouped by spot
    public List<SpotMonthlyIncome> getSpotMonthlyIncome(int year) {
        List<Object[]> results = paymentRepository.findMonthlyIncomeByYearAndSpot(year);
        return results.stream()
                .map(row -> new SpotMonthlyIncome(
                        getMonthName((Integer) row[0]), // Convert month number to name
                        (BigDecimal) row[1], // Income amount
                        (String) row[2], // Parking spot name
                        year))
                .collect(Collectors.toList());
    }

    // Convert month number to name
    private String getMonthName(int month) {
        return java.time.Month.of(month).name();
    }

    // Fetch distinct available years from the payment repository
    public List<Integer> getAvailableYears() {
        return paymentRepository.findDistinctYears(); // Fetch available years from the repository
    }
}
