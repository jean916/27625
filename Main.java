package id_27625.q6;

import java.util.Date;
import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("===== PAYROLL MANAGEMENT SYSTEM (RSSB) =====");

                // -------- ORGANIZATION DETAILS --------
                System.out.print("Enter Organization ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // clear buffer

                System.out.print("Enter Organization Name: ");
                String orgName = sc.nextLine();

                System.out.print("Enter Organization Code (min 3 chars): ");
                String orgCode = sc.nextLine();

                System.out.print("Enter RSSB Number (8 digits): ");
                String rssbNumber = sc.nextLine();

                System.out.print("Enter Contact Email: ");
                String contactEmail = sc.nextLine();

                // -------- DEPARTMENT --------
                System.out.print("Enter Department Name: ");
                String deptName = sc.nextLine();

                System.out.print("Enter Department Code (min 3 chars): ");
                String deptCode = sc.nextLine();

                System.out.print("Enter Manager Name: ");
                String managerName = sc.nextLine();

                // -------- EMPLOYEE DETAILS --------
                System.out.print("Enter Employee ID (>= 1000): ");
                int empID = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Employee Full Name: ");
                String fullName = sc.nextLine();

                System.out.print("Enter Position: ");
                String position = sc.nextLine();

                System.out.print("Enter Base Salary: ");
                double baseSalary = sc.nextDouble();

                System.out.print("Employee Registered in RSSB? (true/false): ");
                boolean rssbRegistered = sc.nextBoolean();

                // -------- PAYROLL PERIOD --------
                System.out.print("Enter Month (1-12): ");
                int month = sc.nextInt();

                System.out.print("Enter Year: ");
                int year = sc.nextInt();

                Date startDate = new Date();
                Date endDate = new Date();

                // -------- SALARY STRUCTURE --------
                System.out.print("Enter Basic Pay: ");
                double basicPay = sc.nextDouble();

                System.out.print("Enter Transport Allowance: ");
                double transportAllowance = sc.nextDouble();

                System.out.print("Enter Housing Allowance: ");
                double housingAllowance = sc.nextDouble();

                // -------- DEDUCTIONS --------
                System.out.print("Enter Loan Deduction: ");
                double loanDeduction = sc.nextDouble();

                // -------- ALLOWANCES --------
                System.out.print("Enter Overtime Hours: ");
                double overtimeHours = sc.nextDouble();

                System.out.print("Enter Overtime Rate: ");
                double overtimeRate = sc.nextDouble();

                System.out.print("Enter Bonus: ");
                double bonus = sc.nextDouble();

                sc.nextLine();

                // -------- PAYSLIP NUMBER --------
                System.out.print("Enter Payslip Number: ");
                String payslipNumber = sc.nextLine();

                Payslip payslip = new Payslip(
                        payslipNumber, id, orgName, orgCode, rssbNumber, contactEmail,
                        deptName, deptCode, managerName,
                        empID, fullName, position, baseSalary, rssbRegistered,
                        month, year, startDate, endDate,
                        basicPay, transportAllowance, housingAllowance,
                        loanDeduction, overtimeHours, overtimeRate, bonus
                );


                // -------- DISPLAY PAYSLIP --------
                System.out.println("\n\n===== GENERATED PAYSLIP =====");
                payslip.generatePayslip();

                System.out.println("===== END =====");

                System.out.println("27625");
} catch (Exception e) {
                System.out.println("\nERROR: " + e.getMessage());
            }

            sc.close();
        }
    }

