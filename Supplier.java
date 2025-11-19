package id_27625.q4;

    public class Supplier extends Department {
        private String supplierName;
        private String supplierTIN;
        private String contact;

        public Supplier(int id, String orgName, String address, String contactEmail,
                        String deptName, String deptCode,
                        String supplierName, String supplierTIN, String contact) throws ProcurementDataException {
            super(id, orgName, address, contactEmail, deptName, deptCode);

            if (!supplierTIN.matches("\\d{9}")) throw new ProcurementDataException("Supplier TIN must be 9 digits.");
            if (!contact.matches("\\d{10}")) throw new ProcurementDataException("Contact must be 10 digits.");

            this.supplierName = supplierName;
            this.supplierTIN = supplierTIN;
            this.contact = contact;
        }
    }
