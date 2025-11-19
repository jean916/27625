package id_27625.q2;

import java.util.Date;

public class Passenger extends Entity{
    private String passengerName;
    private int age;
    private String gender;
    private String contact;

    public Passenger(int id, Date createdDate, Date updatedDate, String passengerName, int age, String gender, String contact) {
        if (age < 0)
            throw new IllegalArgumentException(" age must be a positive integer");
        super(id, createdDate, updatedDate);
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }
}
