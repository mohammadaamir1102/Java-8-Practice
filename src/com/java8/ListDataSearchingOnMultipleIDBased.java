package com.java8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDataSearchingOnMultipleIDBased {
    public static void main(String[] args) throws Exception {
        List<College> listData = getListData();
        System.out.println("before remove");
        listData.forEach(System.out::println);
        System.out.println(listData.size());
        listData.removeIf(remove -> remove.getCollegeName().startsWith("G"));
        System.out.println("after remove");
        listData.forEach(System.out::println);
        System.out.println(listData.size());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int collegeId = Integer.parseInt(br.readLine());
        List<College> filteredList = listData.stream().filter(college -> college.getCollegeID() == collegeId).collect(Collectors.toList());
        if (filteredList.isEmpty()) {
            throw new Exception("Data is not exist");
        }
        filteredList.forEach(System.out::println);
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
