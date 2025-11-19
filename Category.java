package id_27625.q1;

import java.sql.Date;

public class Category extends Entity {
    private String categoryName;
    private String categoryCode;

    public Category(int id, Date createdDate, Date updatedDate, String categoryName, String categoryCode) {
        if (categoryCode.length()<3 || !categoryCode.matches("[a-zA-Z0-9]]+"))
            throw new IllegalArgumentException("category code must be 3 digits");
        super(id, createdDate, updatedDate);
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }
}
