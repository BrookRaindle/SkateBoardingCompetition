class Staff {
    private int staffId;
    private Name name;
    private String permissionLevel;

    public Staff(int staffId, String firstName, String middleName, String lastName, String permissionLevel) {
        this.staffId = staffId;
        this.name = new Name(firstName, middleName, lastName);
        this.permissionLevel = permissionLevel;
    }

    public int getStaffId() {
        return staffId;
    }

    public Name getName() {
        return name;
    }

    public String getPermissionLevel() {
        return permissionLevel;
    }
}