package id_27625.q2;
import java.util.Date;

    class Airport extends Entity {
        private String airportName;
        private String code;
        private String location;

        public Airport(int id, Date createdDate, Date updatedDate, String airportName, String code, String location) {
            if (!code.matches("[A-Z]{3}"))
                throw new IllegalArgumentException("Airport code must contain letters A-Z");
            super(id, createdDate, updatedDate);
            this.airportName = airportName;
            this.code = code;
            this.location = location;
        }
    }

