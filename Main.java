package id_27625.q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<AttendanceRecord> records = new ArrayList<>();

        System.out.println("===== ATTENDANCE MANAGEMENT SYSTEM =====");

        System.out.print("Enter number of students to record: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Student Name: ");
            String name = sc.nextLine();

            System.out.print("Student ID: ");
            String studentID = sc.nextLine();

            System.out.print("Attendance Status (Present/Absent): ");
            String status = sc.nextLine();

            AttendanceRecord record = new AttendanceRecord();
            records.add(record);
            System.out.println("27625");
}

        AttendanceSummary summary = new AttendanceSummary();
        summary.printSummary();

    }
}
