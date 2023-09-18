package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindEvenThenConvertToInteger {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        List<Integer> collect = data.stream().map(Integer::valueOf)
                .filter(even -> even % 2 == 0)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
        Optional<Integer> first = collect.stream().findFirst();
        Optional<Integer> firstAny = collect.stream().findAny();
        if (first.isPresent() || firstAny.isPresent()) {
            System.out.println(first + " " + firstAny);
        }
    }

}
