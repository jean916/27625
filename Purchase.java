package id_27625.q1;

import java.util.Date;

public class Purchase extends Entity {
    private StockItem stockItem;
    private int purchasedQuantity;
    private Date purchasedDate;
    private Supplier supplier;

    public Purchase(int id, java.sql.Date createdDate, java.sql.Date updatedDate, StockItem stockItem, int purchasedQuantity, Date purchasedDate, Supplier supplier) {

        super(id, createdDate, updatedDate);
        if (purchasedQuantity <=0)
            throw new IllegalArgumentException("Quantity > 0");
        if (purchasedDate ==null)
            throw new IllegalArgumentException("Purchase date cannot be null");
        this.stockItem = stockItem;
        this.purchasedQuantity = purchasedQuantity;
        this.purchasedDate = purchasedDate;
        this.supplier = supplier;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }
}
