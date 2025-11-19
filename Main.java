package id_27625.q2;

import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== FLIGHT BOOKING SYSTEM =====");

        // -------- AIRPORT DETAILS --------
        System.out.print("Enter Airport Name: ");
        String airportName = sc.nextLine();

        System.out.print("Enter Airport Code (3 letters): ");
        String airportCode = sc.nextLine();

        System.out.print("Enter Airport Location: ");
        String airportLocation = sc.nextLine();

        Airport airport = new Airport(
                1, new Date(), new Date(),
                airportName, airportCode, airportLocation
        );

        // -------- AIRLINE DETAILS --------
        System.out.print("Enter Airline Name: ");
        String airlineName = sc.nextLine();

        System.out.print("Enter Airline Code: ");
        String airlineCode = sc.nextLine();

        System.out.print("Enter Airline Email: ");
        String airlineEmail = sc.nextLine();

        Airline airline = new Airline(
                2, new Date(), new Date(),
                airlineName, airlineCode, airlineEmail
        );

        // -------- FLIGHT DETAILS --------
        System.out.print("Enter Flight Number: ");
        String flightNumber = sc.nextLine();

        System.out.print("Enter Departure: ");
        String departure = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Base Fare: ");
        double baseFare = sc.nextDouble();
        sc.nextLine(); // clear enter key

        Flight flight = new Flight(
                3, new Date(), new Date(),
                flightNumber, departure, destination, baseFare
        );

        // -------- PILOT --------
        System.out.print("Pilot Name: ");
        String pilotName = sc.nextLine();

        System.out.print("Pilot License No: ");
        String license = sc.nextLine();

        System.out.print("Pilot Experience (years): ");
        int years = sc.nextInt();
        sc.nextLine();

        Pilot pilot = new Pilot(
                4, new Date(), new Date(),
                pilotName, license, years
        );

        // -------- CABIN CREW --------
        System.out.print("Cabin Crew Name: ");
        String crewName = sc.nextLine();

        System.out.print("Role: ");
        String role = sc.nextLine();

        System.out.print("Shift (Day/Night): ");
        String shift = sc.nextLine();


        // -------- PASSENGER --------
        System.out.print("Passenger Name: ");
        String passengerName = sc.nextLine();

        System.out.print("Passenger Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Passenger Gender: ");
        String gender = sc.nextLine();

        System.out.print("Passenger Contact: ");
        String contact = sc.nextLine();

        Passenger passenger = new Passenger(
                6, new Date(), new Date(),
                passengerName, age, gender, contact
        );

        // -------- BOOKING --------
        System.out.print("Seat Number: ");
        String seat = sc.nextLine();

        System.out.print("Travel Class (Economy/Business/First): ");
        String travelClass = sc.nextLine();

        Booking booking = new Booking(
                7, new Date(), new Date(),
                new Date(), seat, travelClass
        );

        // -------- PAYMENT --------
        System.out.print("Payment Method: ");
        String payMethod = sc.nextLine();

        Payment payment = new Payment(
                8, new Date(), new Date(),
                new Date(), payMethod, baseFare
        );

        // -------- TICKET (FINAL CLASS) --------
        Ticket ticket = new Ticket(
                9, new Date(), new Date(),
                "TICK-" + System.currentTimeMillis(),
                new Date(),
                flight,
                payment
        );

        // CALCULATE FINAL FARE
        double fare = ticket.calculateFare();

        // DISPLAY TICKET
        ticket.printTicket();

        sc.close();
        System.out.println("27625");
}
}
