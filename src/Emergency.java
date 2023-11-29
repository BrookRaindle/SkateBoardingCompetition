public class Emergency extends Staff{
    private String permission;
    private String type;

    public Emergency(int StaffID, Name name, String type) {
        super(StaffID, name);
        this.permission = "Emergency";
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String toString() {
        return "Staff Profile{ IDNo:" + StaffID + ", Name: " + name + ", Permissions: " + permission + "}";
    }
}