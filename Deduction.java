package id_27625.q6;


    public class Deduction extends SalaryStructure {
        private double rssbContribution;
        private double payeTax;
        private double loanDeduction;

        public Deduction(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                         String deptName, String deptCode, String managerName,
                         int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                         int month, int year, java.util.Date startDate, java.util.Date endDate,
                         double basicPay, double transportAllowance, double housingAllowance,
                         double loanDeduction) throws PayrollDataException {

            super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                    employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
                    basicPay, transportAllowance, housingAllowance);

            this.rssbContribution = basicPay * 0.05; // 5% of basicPay
            this.payeTax = basicPay * 0.15; // Assume 15% for simplicity
            this.loanDeduction = loanDeduction >= 0 ? loanDeduction : 0;
        }

        public double getTotalDeductions() {
            return rssbContribution + payeTax + loanDeduction;
        }
    }

