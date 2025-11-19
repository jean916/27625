package q3;

    public class TaxDeclaration extends Employee {
        private String declarationMonth;
        private double totalIncome;

        public TaxDeclaration(int id, String authorityName, String region, String email,
                              String categoryName, double rate, String code,
                              String tin, String taxpayerName, String address,
                              String employerName, String employerTIN, String contact,
                              String employeeName, double salary, String employeeTIN,
                              String declarationMonth, double totalIncome) throws TaxDataException {
            super(id, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address,
                    employerName, employerTIN, contact, employeeName, salary, employeeTIN);

            if (totalIncome < 0) throw new TaxDataException("Total income must be >= 0.");

            this.declarationMonth = declarationMonth;
            this.totalIncome = totalIncome;
        }

        public double getTotalIncome() {
            return totalIncome;
        }
    }
