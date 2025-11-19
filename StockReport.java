package id_27625.q1;
import java.sql.Date;
import java.util.Scanner;

public class StockReport  extends Entity{
    private Inventory inventory;

    public StockReport(int id, Date createdDate, Date updatedDate, Inventory inventory) {
        super(id, createdDate, updatedDate);
        this.inventory = inventory;
    }
    public  void generateReport(){
        System.out.println("27625");
        System.out.println("Total Item: " + inventory.getTotalItems());
        System.out.println("Total stock value: " + inventory.getStockValue());

    }
}
