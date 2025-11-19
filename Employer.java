package q3;

    public class Employer extends Taxpayer {
        private String employerName;
        private String employerTIN;
        private String contact;

        public Employer(int id, String authorityName, String region, String email,
                        String categoryName, double rate, String code,
                        String tin, String taxpayerName, String address,
                        String employerName, String employerTIN, String contact) throws TaxDataException {
            super(id, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address);

            if (!employerTIN.matches("\\d{9}")) throw new TaxDataException("Employer TIN must be 9 digits.");
            if (!contact.matches("\\d{10}")) throw new TaxDataException("Contact must be 10 digits.");

            this.employerName = employerName;
            this.employerTIN = employerTIN;
            this.contact = contact;
        }
    }

