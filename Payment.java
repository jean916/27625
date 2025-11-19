package id_27625.q2;

import java.util.Date;

public class Payment extends Entity {
    private Date paymentDate;
    private String paymentMethod;
    private double amountPaid;

    public Payment(int id, Date createdDate, Date updatedDate,
                   Date paymentDate, String paymentMethod, double amountPaid) {
        super(id, createdDate, updatedDate);
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }

    // Getters
    public Date getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    // Setters
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
