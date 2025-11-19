package id_27625.q6;
import java.util.Date;
final class Payslip extends Payroll {
        private String payslipNumber;
        private Date issueDate;


        public Payslip(String payslipNumber, int id, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, Date startDate, Date endDate, double basicPay, double transportAllowance, double housingAllowance, double loanDeduction, double overtimeHours, double overtimeRate, double bonus) throws PayrollDataException {
            super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, loanDeduction, overtimeHours, overtimeRate, bonus);
        }


        public void generatePayslip() {
            System.out.println("===== PAYSLIP =====");
            System.out.println("Payslip Number: " + payslipNumber);
            System.out.println("Issue Date: " + issueDate);
            System.out.println("Employee: " + super.getFullName());
            System.out.println("Gross Salary: " + super.getAllowanceTotal());
            System.out.println("Total Deductions: " + super.getTotalDeductions());
            System.out.println("Net Salary: " + super.getNetSalary());
            System.out.println("==================");
        }
    }
