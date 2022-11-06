package com.session;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ExceptionSession {
    public static void main(String[] args) throws IOException {
        Set<StudentHashCodeAndEqualsMethod> set = new HashSet<>();
        set.add(new StudentHashCodeAndEqualsMethod(1l, "aamir"));
        set.add(new StudentHashCodeAndEqualsMethod(2l, "aasim"));
        set.forEach(itr -> System.out.println(itr));
    }
}
