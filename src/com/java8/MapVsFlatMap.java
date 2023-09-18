package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<Bank> bankingData = BankingDatabase.getAll();


        //here we are getting the name and store into another list = know as a data transformation
        //here map use for one to one mapping
        List<String> accountHolderNames = bankingData.stream()
                .map(Bank::getAccountHolderName).collect(Collectors.toList());
        accountHolderNames.forEach(System.out::println);
        // here one account holder has multiple mobile no that's why one to many mapping
        List<List<String>> accountHolderPhoneNumbers = bankingData.stream()
                .map(Bank::getAccountHolderPhoneNumber).collect(Collectors.toList());
        accountHolderPhoneNumbers.forEach(System.out::println);// here we got stream of stream
        // if want to convert stream of stream into single stream, have to use flatMap() method
        List<String> convertPhonesIntoSingleListByFlatMapMethod = bankingData.stream()
                .flatMap(phone -> phone.getAccountHolderPhoneNumber().stream()).collect(Collectors.toList());
        convertPhonesIntoSingleListByFlatMapMethod.forEach(System.out::println);
        List<Bank> fltr = new ArrayList<>();
        bankingData.stream().map(a -> {
            if (a.getAccountHolderName().startsWith("aas")
                    || a.getAccountHolderName().startsWith("aaq")
                    || a.getAccountHolderName().startsWith("ar")) {
                fltr.add(a);
            }
            return fltr;
        }).collect(Collectors.toList());
       fltr.forEach(a-> System.out.println("filtered List"+a));
    }
}
