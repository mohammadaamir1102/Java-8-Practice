package com.session;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemovingOddElements {
    public static void main(String[] args) {
        List<Integer> number = new CopyOnWriteArrayList<>();
        Collections.addAll(number, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        for (Integer integer : number) {
            if (integer % 2 != 0) {
                number.remove(integer);
            }
        }
        System.out.println(number);
        // but we can remove the elements in list by using CopyOnWriteArrayList

    }
}
