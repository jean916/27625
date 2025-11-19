package q3;
import java.util.regex.Pattern;

    public class TaxAuthority extends Entity {
        private String authorityName;
        private String region;
        private String email;

        public TaxAuthority(int id, String authorityName, String region, String email) throws TaxDataException {
            super(id);
            if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", email)) {
                throw new TaxDataException("Invalid email address.");
            }
            this.authorityName = authorityName;
            this.region = region;
            this.email = email;
        }

        public String getAuthorityName() {
            return authorityName;
        }
    }

