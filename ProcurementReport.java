package id_27625.q4;

import java.util.Date;

    public final class ProcurementReport extends PurchaseOrder {
        private Date reportDate;
        private String summary;

        public ProcurementReport(int id, String orgName, String address, String contactEmail,
                                 String deptName, String deptCode,
                                 String supplierName, String supplierTIN, String contact,
                                 String productName, double unitPrice, int quantity,
                                 String poNumber) throws ProcurementDataException {
            super(id, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact,
                    productName, unitPrice, quantity, poNumber);

            this.reportDate = new Date();
            this.summary = "Total Purchase Amount: " + calculateTotal();
        }

        public double calculateTotal() {
            return getTotalAmount();
        }

        public void printReport() {
            System.out.println("----- PROCUREMENT REPORT -----");
            System.out.println("Report Date: " + reportDate);
            System.out.println("Summary: " + summary);
        }
    }

