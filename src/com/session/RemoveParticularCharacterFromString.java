package com.session;


public class RemoveParticularCharacterFromString {

    public static void main(String[] args) {
       String pan = "12345678999";
        String removedData = removeParticular(pan);
        System.out.println("Thanks bol dena " + removedData);
    }
    private static String removeParticular(String pan) {
        StringBuilder removeFiftieth = new StringBuilder(pan);
        return removeFiftieth.deleteCharAt(4).toString();
    }
}

