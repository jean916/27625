package id_27625.q2;

import java.util.Date;

public class Pilot extends Entity {
    private String pilotName;
    private String licenseNumber;
    private int experenceYear;

    public Pilot(int id, Date createdDate, Date updatedDate, String pilotName, String licenseNumber, int experenceYear) {
        if (experenceYear < 2)
            throw new IllegalArgumentException(" pilot must have at least 2 years of Experience");
        super(id, createdDate, updatedDate);
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experenceYear = experenceYear;
    }
}
