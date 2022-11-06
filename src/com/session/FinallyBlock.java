package com.session;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try {
            int ageCalculation = age / 5;
            System.out.println(ageCalculation);
        } catch (ArithmeticException ar) {
            ar.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("Connection Closed !");
        }

    }
}
