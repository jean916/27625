package id_27625.q5;

import java.util.Date;

public final class AttendanceSummary {
    private Date reportDate;
    private int totalPresent;
    private int totalAbsent;

    // Constructor takes list of attendance records
    public AttendanceSummary() {
        this.reportDate = new Date();
        totalPresent = 0;
        totalAbsent = 0;
    }

    public void printSummary() {
        System.out.println("----- ATTENDANCE SUMMARY -----");
        System.out.println("Report Date: " + reportDate);
        System.out.println("Total Present: " + totalPresent);
        System.out.println("Total Absent: " + totalAbsent);
        if (totalPresent + totalAbsent > 0) {
            double percentage = ((double) totalPresent / (totalPresent + totalAbsent)) * 100;
            System.out.printf("Attendance Percentage: %.2f%%\n", percentage);
        }
    }
}
