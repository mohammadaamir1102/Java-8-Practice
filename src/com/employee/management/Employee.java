package com.employee.management;

public class Employee extends EmployeeTypes {

    private String employeeName;

    public Employee() {
    }

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public Employee(Supervisor supervisor, Associate associate, SeniorAssociate seniorAssociate, String employeeName) {
        super(supervisor, associate, seniorAssociate);
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                '}';
    }
}
