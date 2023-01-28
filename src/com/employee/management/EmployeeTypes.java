package com.employee.management;

public class EmployeeTypes {
    private Supervisor supervisor;
    private Associate associate;
    private SeniorAssociate seniorAssociate;

    public EmployeeTypes() {
    }

    public EmployeeTypes(Supervisor supervisor, Associate associate, SeniorAssociate seniorAssociate) {
        this.supervisor = supervisor;
        this.associate = associate;
        this.seniorAssociate = seniorAssociate;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public Associate getAssociate() {
        return associate;
    }

    public void setAssociate(Associate associate) {
        this.associate = associate;
    }

    public SeniorAssociate getSeniorAssociate() {
        return seniorAssociate;
    }

    public void setSeniorAssociate(SeniorAssociate seniorAssociate) {
        this.seniorAssociate = seniorAssociate;
    }

    @Override
    public String toString() {
        return "EmployeeTypes{" + "supervisor=" + supervisor + ", associate=" + associate + ", seniorAssociate=" + seniorAssociate + '}';
    }
}
