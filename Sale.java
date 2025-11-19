package id_27625.q1;

import java.sql.Date;

public class Sale extends Entity {
    private StockItem stockItem;
    private int soldQuantity;
    private Date soldDate;
    private String CustomerName;

    public Sale(int id, Date createdDate, Date updatedDate, StockItem stockItem, int soldQuantity, Date saleDate, String customerName) {
        if (soldQuantity <= 0)
            throw new IllegalArgumentException("soldQuantity must be greater than 0");
        if (saleDate == null)
            throw new IllegalArgumentException("saleDate must not be null");
        super(id, createdDate, updatedDate);
        this.stockItem = stockItem;
        this.soldQuantity = soldQuantity;
        this.soldDate = saleDate;
        this.CustomerName = customerName;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }
}

