package id_27625.q6;


import java.util.Date;

    public class PayrollPeriod extends Employee {
        private int month;
        private int year;
        private Date startDate;
        private Date endDate;

        public PayrollPeriod(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                             String deptName, String deptCode, String managerName,
                             int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                             int month, int year, Date startDate, Date endDate) throws PayrollDataException {

            super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                    employeeID, fullName, position, baseSalary, rssbRegistered);

            if (month < 1 || month > 12) throw new PayrollDataException("Month must be 1-12.");
            if (year < 2000) throw new PayrollDataException("Year must be >= 2000.");
            if (startDate == null || endDate == null) throw new PayrollDataException("Dates cannot be null.");

            this.month = month;
            this.year = year;
            this.startDate = startDate;
            this.endDate = endDate;
        }
    }

