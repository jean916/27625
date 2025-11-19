package id_27625.q2;

public class CabinCrew {
    private String crewName;
    private String role;
    private String Shift;

    public CabinCrew(String crewName, String role, String shift) {
        if (!(shift.equals("Day") || shift.equals("Night")))
            throw new IllegalArgumentException(" shift must be Day or Night");
        this.crewName = crewName;
        this.role = role;
       this.Shift = shift;
    }
}
