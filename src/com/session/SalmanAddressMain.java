package com.session;
import java.util.ArrayList;
import java.util.List;

public class SalmanAddressMain {

    public static void main(String[] args) {
        List<SalmanAddress> list = new ArrayList<>();
        list.add(new SalmanAddress(1,"salman khan","Balaipur",34532534,4534534));
        for (SalmanAddress salmanAddress : list) {
            System.out.println(salmanAddress);
        }
    }
}
