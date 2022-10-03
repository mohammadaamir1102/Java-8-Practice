package com.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UserOperationOnMap {

    public static void main(String[] args) {
        List<User> user = getUser();
        convertingEntityIntoMap(user); // here converting entity into map
        convertingEntityIntoMapOnlyIDIsKeyRestAsObject(user); // here converting entity into map (only id make key rest as a object)
        convertingEntityIntoMapWithDuplicateKey(user); // this method throw the IllegalStatementException
        convertingEntityIntoMapWithDuplicateKeySolvedException(user);
    }

    private static void convertingEntityIntoMapWithDuplicateKeySolvedException(List<User> user) {
        Map<String, Integer> afterConvertingData = user.stream().collect(Collectors.toMap(User::getName, User::getAge, (oldValue, newValue) -> oldValue));
        afterConvertingData.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Map<String, Integer> afterConvertingDataIntoHasMap = user.stream().collect(Collectors.toMap(User::getName, User::getAge, (oldValue, newValue) -> oldValue, HashMap::new));
        //here we can get data into any required MAP like, LinkedHashMap, HashMap, TreeMap
        afterConvertingDataIntoHasMap.forEach((k, v) -> System.out.println(k + " " + v));
    }

    private static void convertingEntityIntoMapWithDuplicateKey(List<User> user) {
        Map<String, Integer> afterConvertingData = user.stream().collect(Collectors.toMap(User::getName, User::getAge));
        afterConvertingData.forEach((k, v) -> System.out.println(k + " " + v));
    }

    private static void convertingEntityIntoMapOnlyIDIsKeyRestAsObject(List<User> user) {
        Map<Long, User> afterConvertingData = user.stream().collect(Collectors.toMap(User::getId, Function.identity()));
        /*here we will get the IllegalStateException: Duplicate key Aamir (attempted merging values 23 and 19)
         for avoiding this we have to follow this way Collectors.toMap(keyMapper, valueMapper, mergeFunction)
         by this way duplicate value will be merged.
         */
        afterConvertingData.forEach((k, v) -> System.out.println(k + " " + v));
    }

    private static void convertingEntityIntoMap(List<User> user) {
        Map<Long, String> afterConvertingData = user.stream().collect(Collectors.toMap(User::getId, User::getName));
        afterConvertingData.entrySet().stream().forEach(a -> System.out.println(a)); //here printing
        afterConvertingData.forEach((k, v) -> System.out.println(k + " " + v)); //here printing
    }

    private static List<User> getUser() {
        return List.of(
                  new User(1L, "Aamir", 23)
                , new User(2L, "Salman", 42)
                , new User(3L, "Imran", 29)
                , new User(4L, "Gufran", 30)
                , new User(5L, "Hassan", 18)
                , new User(6L, "Aamir", 19));
    }
}
