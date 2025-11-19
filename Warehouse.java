package id_27625.q1;

public class Warehouse {
    private String warehouseName;
    private String location;
    private String phone;

    public Warehouse(String warehouseName, String location, String phone) {
        if(!phone.matches("\\d{3}"))
            throw new IllegalArgumentException("phone number must be 10 digits");
        this.warehouseName = warehouseName;
        this.location = location;
        this.phone = phone;
    }
}
