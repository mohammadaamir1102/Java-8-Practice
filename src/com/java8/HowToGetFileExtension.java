package com.java8;

public class HowToGetFileExtension {

    public static void main(String[] args) {
        String extensionString = "aamir.xlxs";
        System.out.println(extensionString.substring(extensionString.lastIndexOf('.') + 1));
    }

}
