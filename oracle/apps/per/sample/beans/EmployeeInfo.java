package oracle.apps.per.sample.beans;

import java.util.List;

public class EmployeeInfo {

    private List<Employee> employees;
    
    public EmployeeInfo() {
    }
    
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    public List<Employee> getEmployees() {
        return this.employees;
    }
}
