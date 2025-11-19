package id_27625.q1;

import java.sql.Date;

public class Product extends Entity {
    private String productName;
    private double unityPrice;
    private int stocklimit;

    public Product(int id, Date createdDate, Date updatedDate, String productName, double unityPrice, int stocklimit) {
        if(unityPrice <= 0)
            throw new IllegalArgumentException("price must be greater than 0");
        if(stocklimit <= 0)
            throw new IllegalArgumentException("stocklimit must be greater than 0");
        super(id, createdDate, updatedDate);
        this.productName = productName;
        this.unityPrice = unityPrice;
        this.stocklimit = stocklimit;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnityPrice() {
        return unityPrice;
    }

    public int getStocklimit() {
        return stocklimit;
    }
}
