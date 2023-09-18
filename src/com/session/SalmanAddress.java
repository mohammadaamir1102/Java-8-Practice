package com.session;

public class SalmanAddress {

    private Integer id;
    private String name;
    private String address;
    private Integer phone;
    private Integer pinCode;



    public SalmanAddress(Integer id, String name, String address, Integer phone, Integer pinCode) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "SalmanAddress{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", pinCode=" + pinCode +
                '}';
    }
}
