package id_27625.q1;

import java.util.Date;

public class Inventory extends Entity {

    private int totalItems;
    private double stockValue;

    // Constructor with id and dates
    public Inventory(int id, Date createdDate, Date updatedDate) {
        super(id, (java.sql.Date) createdDate, (java.sql.Date) updatedDate);
        this.totalItems = 0;   // initially 0
        this.stockValue = 0.0; // initially 0.0
    }

    public int getTotalItems() {
        return totalItems;
    }

    public double getStockValue() {
        return stockValue;
    }

    // Add stock method
    public void addStock(double price, int quantity) {
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Price and quantity must be positive");
        }

        totalItems += quantity;
        stockValue += price * quantity;
    }
}
