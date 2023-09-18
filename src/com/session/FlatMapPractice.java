package com.session;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapPractice {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        List<String> newList = Stream.of(list1, list2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(newList);

    }
}
