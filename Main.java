package id_27625.q1;

import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Unit Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        // Create Inventory
        Inventory inventory = new Inventory(
                1,
                new java.util.Date(), // createdDate
                new java.util.Date()  // updatedDate
        );

        inventory.addStock(price, qty); // only price and quantity

        // Convert to java.sql.Date for StockReport
        java.sql.Date createdDate = new java.sql.Date(System.currentTimeMillis());
        java.sql.Date updatedDate = new java.sql.Date(System.currentTimeMillis());

        // Generate report
        StockReport report = new StockReport(
                1,
                createdDate,
                updatedDate,
                inventory
        );
        report.generateReport();

        sc.close();
        System.out.println("27625");
}
}
