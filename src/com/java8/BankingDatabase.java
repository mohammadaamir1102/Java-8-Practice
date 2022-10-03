package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankingDatabase {

    public static List<Bank> getAll() {
        return Stream.of(
                new Bank(1, "aamir", Arrays.asList("8726881557", "88789878798")),
                new Bank(2, "aasim", Arrays.asList("34534534", "7567456")),
                new Bank(3, "aaquib", Arrays.asList("68665636", "6455245")),
                new Bank(4, "arman", Arrays.asList("4765635", "6245646"))
        ).collect(Collectors.toList());

    }
}
