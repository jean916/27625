package id_27625.q2;
import  java.util.Scanner;
import  java.util.Date;

public class Entity {

    private int id;
    private Date createdDate;
    private Date updatedDate;

    public Entity(int id, Date createdDate, Date updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("ID > 0");
        if (createdDate == null || updatedDate == null)
            throw new IllegalArgumentException("Dates cannot be null");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Entity() {
    }

    public void printTicket() {

    }
}

