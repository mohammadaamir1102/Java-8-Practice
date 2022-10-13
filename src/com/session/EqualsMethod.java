package com.session;

import java.sql.Timestamp;
import java.util.Date;

class Xyz {
private Timestamp date;

    public Xyz() {
    }

    public Xyz(Timestamp date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}

public class EqualsMethod {
    public static void main(String[] args) {
        Xyz xyz = new Xyz();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        xyz.setDate(timestamp);
        getData(xyz);
    }

    private static void getData(Xyz xyz) {
        Xyz xyz1 = new Xyz();
        Timestamp timestamp = new Timestamp(xyz.getDate().getTime());
        xyz1.setDate(timestamp);
        System.out.println(xyz1.getDate());
    }
}
