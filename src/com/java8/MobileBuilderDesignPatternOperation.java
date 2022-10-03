package com.java8;

public class MobileBuilderDesignPatternOperation {

    public static void main(String[] args) {
        MobileBuilderDesignPattern samsung = new MobileBuilderDesignPattern
                .Builder().setMobileName("SAMASUN").setPrice(15000d).build();
        System.out.println(samsung);
    }
}
