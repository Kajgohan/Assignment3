import java.util.ArrayList;

public class Manager extends Employee {
    protected ArrayList<Employee> employees;
    protected Manager manager;
    protected int recruitedID;

    public Manager(String employeeName) {
        super(employeeName);
    }

    public Manager(String employeeName, ArrayList<Employee> employees, Manager manager, int recruitedID) {
        super(employeeName);
        this.employees = employees;
        this.manager = manager;
        this.recruitedID = recruitedID;
    }

    void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    Manager getManager() {
        return manager;
    }

    void setManager(Manager manager) {
        this.manager = manager;
    }

    int getRecruitedID() {
        return recruitedID;
    }

    void setRecruitedID(int recruitedID) {
        this.recruitedID = recruitedID;
    }

    double bonus(){
        return(0.0);
    }

    ArrayList<Employee> getEmployees(){
        return(employees);
    }





    @java.lang.Override
    public java.lang.String toString() {
        return "Manager{" +
                "employees=" + employees +
                ", manager=" + manager +
                ", recruitedID=" + recruitedID +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
