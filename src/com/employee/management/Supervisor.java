package com.employee.management;

public class Supervisor {

    private String supervisor;

    public Supervisor() {
    }

    public Supervisor(String supervisor) {
        this.supervisor = "Supervisor";
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "supervisor='" + supervisor + '\'' +
                '}';
    }
}
