package id_27625.q4;

import java.util.regex.Pattern;

    public class Organization extends Entity {
        private String orgName;
        private String address;
        private String contactEmail;

        public Organization(int id, String orgName, String address, String contactEmail) throws ProcurementDataException {
            super(id);
            if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", contactEmail)) {
                throw new ProcurementDataException("Invalid email address.");
            }
            this.orgName = orgName;
            this.address = address;
            this.contactEmail = contactEmail;
        }

        public String getOrgName() {
            return orgName;
        }
    }
