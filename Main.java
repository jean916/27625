package id_27625.q4;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("===== PROCUREMENT MANAGEMENT SYSTEM =====");

                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Organization Name: ");
                String orgName = sc.nextLine();

                System.out.print("Enter Address: ");
                String address = sc.nextLine();

                System.out.print("Enter Contact Email: ");
                String email = sc.nextLine();

                System.out.print("Enter Department Name: ");
                String deptName = sc.nextLine();

                System.out.print("Enter Department Code: ");
                String deptCode = sc.nextLine();

                System.out.print("Enter Supplier Name: ");
                String supplierName = sc.nextLine();

                System.out.print("Enter Supplier TIN (9 digits): ");
                String supplierTIN = sc.nextLine();

                System.out.print("Enter Supplier Contact (10 digits): ");
                String contact = sc.nextLine();

                System.out.print("Enter Product Name: ");
                String productName = sc.nextLine();

                System.out.print("Enter Unit Price: ");
                double unitPrice = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter PO Number: ");
                String poNumber = sc.nextLine();

                ProcurementReport report = new ProcurementReport(id, orgName, address, email,
                        deptName, deptCode,
                        supplierName, supplierTIN, contact,
                        productName, unitPrice, quantity,
                        poNumber);

                report.printReport();

                System.out.println("27625");
} catch (ProcurementDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
