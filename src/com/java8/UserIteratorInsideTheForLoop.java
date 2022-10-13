package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UserIteratorInsideTheForLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"A","B","C","D");
        for (Iterator<String> itr = list.iterator(); itr.hasNext();){
            String next = itr.next();
            if(next.equalsIgnoreCase("a")){
                System.out.println("a is exists !");
            }
        }
    }
}
