package id_27625.q2;

import java.util.Date;

public class Flight extends Entity {
    private String flightNumber;
    private String departure;
    private String destination;
    private double baseFare;

    public Flight(int id, Date createdDate, Date updatedDate, String flightNumber, String departure, String destination, double baseFare) {
        if (baseFare < 0) throw new IllegalArgumentException("Base fare must be a positive number");
        super(id, createdDate, updatedDate);
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.baseFare = baseFare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public double getBaseFare() {
        return baseFare;
    }
}
