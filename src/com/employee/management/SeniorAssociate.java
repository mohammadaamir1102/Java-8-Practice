package com.employee.management;

public class SeniorAssociate {

    private String seniorAssociate;

    public SeniorAssociate() {
    }

    public SeniorAssociate(String seniorAssociate) {
        this.seniorAssociate = "Senior Associate";
    }

    public String getSeniorAssociate() {
        return seniorAssociate;
    }

    public void setSeniorAssociate(String seniorAssociate) {
        this.seniorAssociate = seniorAssociate;
    }

    @Override
    public String toString() {
        return "SeniorAssociate{" +
                "seniorAssociate='" + seniorAssociate + '\'' +
                '}';
    }
}

