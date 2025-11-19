package id_27625.q6;

    public class Allowance extends Deduction {
        private double overtimeHours;
        private double overtimeRate;
        private double bonus;

        public Allowance(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                         String deptName, String deptCode, String managerName,
                         int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                         int month, int year, java.util.Date startDate, java.util.Date endDate,
                         double basicPay, double transportAllowance, double housingAllowance,
                         double loanDeduction, double overtimeHours, double overtimeRate, double bonus) throws PayrollDataException {

            super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                    employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
                    basicPay, transportAllowance, housingAllowance, loanDeduction);

            if (overtimeHours < 0 || overtimeRate < 0 || bonus < 0)
                throw new PayrollDataException("Overtime and bonus must be >= 0");

            this.overtimeHours = overtimeHours;
            this.overtimeRate = overtimeRate;
            this.bonus = bonus;
        }

        public double getAllowanceTotal() {
            return (overtimeHours * overtimeRate) + bonus + super.getGrossSalary();
        }
    }

