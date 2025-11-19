package id_27625.q6;

public class Department extends Organization {
        private String deptName;
        private String deptCode;
        private String managerName;

        public Department(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                          String deptName, String deptCode, String managerName) throws PayrollDataException {
            super(id, orgName, orgCode, rssbNumber, contactEmail);

            if (deptCode.length() < 3) throw new PayrollDataException("Department code must be at least 3 characters.");
            if (deptName.isEmpty() || managerName.isEmpty()) throw new PayrollDataException("Department and manager names cannot be empty.");

            this.deptName = deptName;
            this.deptCode = deptCode;
            this.managerName = managerName;
        }
    }

