package id_27625.q6;

    public class Payroll extends Allowance {
        private double grossSalary;
        private double totalDeductions;
        private double netSalary;

        public Payroll(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                       String deptName, String deptCode, String managerName,
                       int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                       int month, int year, java.util.Date startDate, java.util.Date endDate,
                       double basicPay, double transportAllowance, double housingAllowance,
                       double loanDeduction, double overtimeHours, double overtimeRate, double bonus) throws PayrollDataException {

            super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                    employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
                    basicPay, transportAllowance, housingAllowance, loanDeduction, overtimeHours, overtimeRate, bonus);

            this.grossSalary = getAllowanceTotal();
            this.totalDeductions = getTotalDeductions();
            this.netSalary = grossSalary - totalDeductions;
        }

        public double getNetSalary() {
            return netSalary;
        }
    }
