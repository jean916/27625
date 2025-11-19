package id_27625.q2;

import java.util.Date;

public class Ticket  extends Entity{
    private String ticketNumber;
    private Date issueDate;
    private Flight flight;
    private Payment payment;

    public Ticket(int id, Date createdDate, Date updatedDate, String ticketNumber, Date issueDate, Flight flight, Payment payment) {
        super(id, createdDate, updatedDate);
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
        this.flight = flight;
        this.payment = payment;
    }
    public double calculateFare(){
        double taxes =flight.getBaseFare() * 0.16;
        double discount =0;
        return flight.getBaseFare() + taxes - discount;
    }
    public Ticket() {
        System.out.println(27625);
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Total Fare: " + calculateFare());
        System.out.println("====================");
    }
}
