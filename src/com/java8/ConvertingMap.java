package com.java8;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertingMap {

    public static void main(String[] args) {
        List<StudentBook> studentBook = ComparatorJava8Example.getStudentBook();



      /*  System.out.println("_________________");
        Map<Integer, StudentBook> map = studentBook.stream()
                .collect(Collectors.toMap(StudentBook::getId, Function.identity()));

        for (Map.Entry<Integer,StudentBook> mapItr : map.entrySet()){
            System.out.println(mapItr.getKey() + " "+ mapItr.getValue());
        }
        ["a","b"]---- transformation ["A","B"] one-to-one
        flatMap
        List<List<Employee>>
        [[1,2],[2,3],[4,5]]  ----> [1,2,3,4,5]
        System.out.println("----------------------------");
        map.forEach((k,v)-> System.out.println(k+" "+v));

        System.out.println("___________________");
        Map<Integer, String> map1 = studentBook.stream()
                .collect(Collectors.toMap(StudentBook::getId, StudentBook::getBookName));
        map1.entrySet().stream().forEach(System.out::println);

        System.out.println("_________________________________");*/
     /*   Map<Integer, String> collect1 = studentBook.stream()
                .collect(Collectors.toMap(StudentBook::getId, StudentBook::getBookName,(oldValue,newValue)->oldValue));
        collect1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

        System.out.println("++++++++++++++++++");
        collect1.entrySet().stream().sorted(Map.Entry.comparingByKey((a1,a2)->a2.compareTo(a1))).forEach(System.out::println);

        Optional<Employee> emp= Optional.empty();  /empty
        emp.getFirst();
        Optional.ofNullable(emp.getFirst());
        Optional.of(emp.getFirst());

*/
    }
}
