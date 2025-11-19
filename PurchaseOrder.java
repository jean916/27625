package id_27625.q4;


import java.util.Date;

    public class PurchaseOrder extends Product {
        private String poNumber;
        private Date orderDate;
        private double totalAmount;

        public PurchaseOrder(int id, String orgName, String address, String contactEmail,
                             String deptName, String deptCode,
                             String supplierName, String supplierTIN, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber) throws ProcurementDataException {
            super(id, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact,
                    productName, unitPrice, quantity);

            if (poNumber.isEmpty()) throw new ProcurementDataException("PO number cannot be empty.");

            this.poNumber = poNumber;
            this.orderDate = new Date();
            this.totalAmount = getTotalPrice();
        }

        public double getTotalAmount() {
            return totalAmount;
        }
    }

