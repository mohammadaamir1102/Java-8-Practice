package com.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserEntityOperationByMap {

    public static void main(String[] args) {
        List<UserEntity> userData = getUserData();
//        Map<Long, UserEntity> collect1 =
//                userData.stream().collect(Collectors.toMap(UserEntity::getId, Function.identity()));
        Map<Long, String> collect = userData.stream().collect(Collectors
                        .toMap(UserEntity::getId, UserEntity::getName
                ,(oldValue, newValue) -> oldValue));
        for (Map.Entry<Long, String> map : collect.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }

    private static List<UserEntity> getUserData() {
        List<UserEntity> userData = List.of(
                new UserEntity(1L, "aamir khan", 45000.00, "MindCraft"),
                new UserEntity(2L, "aasim khan", 54344.00, "MindCraft"),
                new UserEntity(3L, "aaquib khan", 764564.00, "MindCraft"),
                new UserEntity(4L, "salman khan", 4345345.00, "MindCraft"),
                new UserEntity(1L, "furqan khan", 86556.00, "MindCraft")
        );
        return userData;
    }

}
