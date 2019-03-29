public abstract class Employee {

    protected String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    String getEmployeeName() {
        return employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
