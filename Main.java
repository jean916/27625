package q3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("===== TAX ADMINISTRATION SYSTEM =====");

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Authority Name: ");
            String authName = sc.nextLine();

            System.out.print("Enter Region: ");
            String region = sc.nextLine();

            System.out.print("Enter Authority Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Tax Category Name: ");
            String catName = sc.nextLine();

            System.out.print("Enter Tax Rate: ");
            double rate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Tax Code: ");
            String code = sc.nextLine();

            System.out.print("Enter Taxpayer TIN: ");
            String tin = sc.nextLine();

            System.out.print("Enter Taxpayer Name: ");
            String tpName = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Employer Name: ");
            String empName = sc.nextLine();

            System.out.print("Enter Employer TIN: ");
            String empTIN = sc.nextLine();

            System.out.print("Enter Employer Contact (10 digits): ");
            String contact = sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String employeeName = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Employee TIN: ");
            String employeeTIN = sc.nextLine();

            System.out.print("Enter Declaration Month: ");
            String month = sc.nextLine();

            System.out.print("Enter Total Income: ");
            double totalIncome = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Receipt No: ");
            String receiptNo = sc.nextLine();

            TaxRecord record = new TaxRecord(id, authName, region, email, catName, rate, code, tin,
                    tpName, address, empName, empTIN, contact,
                    employeeName, salary, employeeTIN,
                    month, totalIncome, receiptNo);

            System.out.println("\nTax Computation Completed:");
            System.out.println("Receipt No: " + receiptNo);
            System.out.println("Total Tax: " + record.getTotalTax());

            System.out.println("27625");
} catch (TaxDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
