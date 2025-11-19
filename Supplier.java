package id_27625.q1;

import java.sql.Date;

public class Supplier  extends Entity{
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, Date createdDate, Date updatedDate, String supplierName, String supplierEmail, String supplierPhone) {
        if (!supplierEmail.contains("@"))
            throw new IllegalArgumentException("invalid email");
        if (!supplierPhone.matches("\\d{3}"))
            throw new IllegalArgumentException("invalid phone number");
        super(id, createdDate, updatedDate);
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }
}
