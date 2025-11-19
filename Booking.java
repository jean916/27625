package id_27625.q2;

import java.util.Date;

public class Booking extends Entity {
    private Date bookingDate;
    private String seatNumber;
    private String travelClass;

    public Booking(int id, Date createdDate, Date updatedDate,
                   Date bookingDate, String seatNumber, String travelClass) {

        super(id, createdDate, updatedDate);  // MUST BE FIRST

        if (!(travelClass.equals("Economy") ||
                travelClass.equals("Business") ||
                travelClass.equals("First"))) {

            throw new IllegalArgumentException("Travel class must be Economy, Business, or First");
        }

        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass;
    }

    public void printBooking() {
        System.out.println("Booking Date: " + bookingDate);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Class: " + travelClass);
    }
}
