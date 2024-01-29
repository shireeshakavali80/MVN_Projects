public class CSEDepartment extends Department {
    private final int departmentSize;
    public CSEDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }
    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }
    public static void main(String[] args) {

        CSEDepartment csDep = new CSEDepartment(10);
        System.out.println("Department Size: " + csDep.getDepartmentSize());
    }
}
