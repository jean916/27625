package id_27625.q4;


    public class Department extends Organization {
        private String deptName;
        private String deptCode;

        public Department(int id, String orgName, String address, String contactEmail,
                          String deptName, String deptCode) throws ProcurementDataException {
            super(id, orgName, address, contactEmail);
            if (deptCode.length() < 3 || !deptCode.matches("[a-zA-Z0-9]+")) {
                throw new ProcurementDataException("Department code must be alphanumeric and at least 3 characters.");
            }
            this.deptName = deptName;
            this.deptCode = deptCode;
        }

        public String getDeptName() {
            return deptName;
        }
    }

