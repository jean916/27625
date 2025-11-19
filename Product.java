package id_27625.q4;

    public class Product extends Supplier {
        private String productName;
        private double unitPrice;
        private int quantity;

        public Product(int id, String orgName, String address, String contactEmail,
                       String deptName, String deptCode,
                       String supplierName, String supplierTIN, String contact,
                       String productName, double unitPrice, int quantity) throws ProcurementDataException {
            super(id, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact);

            if (unitPrice <= 0) throw new ProcurementDataException("Unit price must be > 0.");
            if (quantity < 0) throw new ProcurementDataException("Quantity cannot be negative.");

            this.productName = productName;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
        }

        public double getTotalPrice() {
            return unitPrice * quantity;
        }
    }

