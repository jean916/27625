package id_27625.q1;

import java.sql.Date;

public class StockItem  extends Entity{
    private int quantityAvailable;
    private int reoderLevel;

    public StockItem(int id, Date createdDate, Date updatedDate, int quantityAvailable, int reoderLevel) {
        super(id, createdDate, updatedDate);
        this.quantityAvailable = quantityAvailable;
        this.reoderLevel = reoderLevel;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }
}
