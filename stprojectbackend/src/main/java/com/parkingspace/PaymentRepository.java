package com.parkingspace;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    @Query("SELECT MONTH(p.dateTime) AS month, COUNT(p.paymentId) AS userCount, p.parkingSpotName " + // Changed to parkingSpotName
           "FROM Payment p WHERE p.status = 'Paid' AND YEAR(p.dateTime) = :year " +
           "GROUP BY MONTH(p.dateTime), p.parkingSpotName " +
           "ORDER BY MONTH(p.dateTime), p.parkingSpotName")
    List<Object[]> findMonthlyUserCountsByYearAndSpot(int year);

    // Fetch monthly income grouped by spot for a specific year
    @Query("SELECT MONTH(p.dateTime) AS month, SUM(p.amountPaid) AS totalIncome, p.parkingSpotName " + // Changed to parkingSpotName
           "FROM Payment p WHERE p.status = 'Paid' AND YEAR(p.dateTime) = :year " +
           "GROUP BY MONTH(p.dateTime), p.parkingSpotName " +
           "ORDER BY MONTH(p.dateTime), p.parkingSpotName")
    List<Object[]> findMonthlyIncomeByYearAndSpot(int year);

    // Fetch distinct years from the payment data
    @Query("SELECT DISTINCT YEAR(p.dateTime) FROM Payment p")
    List<Integer> findDistinctYears();
}
