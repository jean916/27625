package q3;

    public final class TaxRecord extends TaxDeclaration {
        private String receiptNo;
        private double totalTax;

        public TaxRecord(int id, String authorityName, String region, String email,
                         String categoryName, double rate, String code,
                         String tin, String taxpayerName, String address,
                         String employerName, String employerTIN, String contact,
                         String employeeName, double salary, String employeeTIN,
                         String declarationMonth, double totalIncome,
                         String receiptNo) throws TaxDataException {
            super(id, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address,
                    employerName, employerTIN, contact, employeeName, salary, employeeTIN,
                    declarationMonth, totalIncome);

            this.receiptNo = receiptNo;
            this.totalTax = computeTax();
        }

        public double computeTax() {
            return getSalary() * super.getRate(); // Simple computation, can add credits if needed
        }

        public double getTotalTax() {
            return totalTax;
        }
    }

