package q3;


    public class Employee extends Employer {
        private String employeeName;
        private double salary;
        private String employeeTIN;

        public Employee(int id, String authorityName, String region, String email,
                        String categoryName, double rate, String code,
                        String tin, String taxpayerName, String address,
                        String employerName, String employerTIN, String contact,
                        String employeeName, double salary, String employeeTIN) throws TaxDataException {
            super(id, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact);

            if (salary <= 0) throw new TaxDataException("Salary must be greater than 0.");
            if (!employeeTIN.matches("\\d{9}")) throw new TaxDataException("Employee TIN must be 9 digits.");

            this.employeeName = employeeName;
            this.salary = salary;
            this.employeeTIN = employeeTIN;
        }

        public double getSalary() {
            return salary;
        }
    }

