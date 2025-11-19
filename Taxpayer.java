package q3;

    public class Taxpayer extends TaxCategory {
        private String tin;
        private String taxpayerName;
        private String address;

        public Taxpayer(int id, String authorityName, String region, String email,
                        String categoryName, double rate, String code,
                        String tin, String taxpayerName, String address) throws TaxDataException {
            super(id, authorityName, region, email, categoryName, rate, code);

            if (!tin.matches("\\d{9}")) throw new TaxDataException("TIN must be 9 digits.");
            if (taxpayerName.isEmpty()) throw new TaxDataException("Name cannot be empty.");

            this.tin = tin;
            this.taxpayerName = taxpayerName;
            this.address = address;
        }

        public String getTin() {
            return tin;
        }
    }

