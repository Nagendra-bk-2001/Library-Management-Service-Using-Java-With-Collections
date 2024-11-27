package com.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateUtils {

    private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // Format a LocalDate into a string
    public static String formatDate(LocalDate date) {
        return date.format(DEFAULT_FORMATTER);
    }

    // Parse a date string into a LocalDate
    public static LocalDate parseDate(String dateString) {
        return LocalDate.parse(dateString, DEFAULT_FORMATTER);
    }

    // Check if a date is overdue
    public static boolean isOverdue(LocalDate dueDate) {
        return LocalDate.now().isAfter(dueDate);
    }

    // Calculate the number of days between two dates
    public static long daysBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    // Calculate the remaining days until a due date
    public static long daysUntilDueDate(LocalDate dueDate) {
        return daysBetween(LocalDate.now(), dueDate);
    }

}
