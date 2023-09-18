package com.employee.management;

public class Associate {

    private String associate;
    public Associate() {
    }

    public Associate(String associate) {
        this.associate = "Associate";
    }

    public String getAssociate() {
        return associate;
    }

    public void setAssociate(String associate) {
        this.associate = associate;
    }

    @Override
    public String toString() {
        return "Associate{" +
                "associate='" + associate + '\'' +
                '}';
    }
}
