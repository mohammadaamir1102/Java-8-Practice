package com.java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {
        List<College> listData = getListData();
//        listData.forEach(System.out::println);
        System.out.println("_______________");
        listData.parallelStream().forEach(System.out::println);
    }


    public static List<College> getListData() {
        List<College> college = new ArrayList<>();
        college.add(new College(1, "GIC", "Basti", LocalDate.of(1911, 05, 01)));
        college.add(new College(2, "GKP", "GKP", LocalDate.of(1999, 05, 01)));
        college.add(new College(3, "BKGINC", "Basti", LocalDate.of(1945, 05, 01)));
        college.add(new College(4, "GGIC", "Basti", LocalDate.of(1978, 05, 01)));
        college.add(new College(5, "KIC", "Basti", LocalDate.of(1966, 05, 01)));
        college.add(new College(6, "KDC", "Basti", LocalDate.of(1938, 05, 01)));
        college.add(new College(7, "APNPGC", "Basti", LocalDate.of(2005, 05, 01)));
        return college;
    }
}
