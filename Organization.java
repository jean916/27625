package id_27625.q6;

import java.util.regex.Pattern;

    public class Organization extends Entity {
        private String orgName;
        private String orgCode;
        private String rssbNumber;
        private String contactEmail;

        public Organization(int id, String orgName, String orgCode, String rssbNumber, String contactEmail) throws PayrollDataException {
            super(id);

            if (orgCode.length() < 3) throw new PayrollDataException("Organization code must be at least 3 characters.");
            if (!rssbNumber.matches("\\d{8}")) throw new PayrollDataException("RSSB Number must be 8 digits.");
            if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", contactEmail))
                throw new PayrollDataException("Invalid email address.");

            this.orgName = orgName;
            this.orgCode = orgCode;
            this.rssbNumber = rssbNumber;
            this.contactEmail = contactEmail;
        }
    }

