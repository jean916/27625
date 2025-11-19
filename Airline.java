package id_27625.q2;

import java.util.Date;

public class Airline extends Entity {
        private String airlineName;
        private String airlineCode;
        private String contactEmail;

    public Airline(int id, Date createdDate, Date updatedDate, String airlineName, String airlineCode, String contactEmail) {
        if (!airlineCode.matches("[A-Za-z]{2,4}"))
            throw new IllegalArgumentException("Airline code must contain letters 2-4");
        if (!contactEmail.contains("@"))
            throw new IllegalArgumentException("inalid email");
        super(id, createdDate, updatedDate);
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }
}

