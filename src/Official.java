public class Official extends Staff{
    private String permission;

    public Official(int StaffID, Name name) {
        super(StaffID, name);
        this.permission = "Official";
    }

    public String toString() {
        return "Staff Profile{ IDNo:" + StaffID + ", Name: " + name + ", Permissions: " + permission + "}";
    }
}