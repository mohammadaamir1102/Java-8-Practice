package com.session;

import java.util.Scanner;

public class RoundFigureManuallyLogic {
    public static void main(String[] args) {
        while (true) {
            Scanner i = new Scanner(System.in);
            System.out.println("Enter the Number");
            String input = i.next();
            String gettingDecimalNo = input.substring(input.lastIndexOf('.') + 1);
            long valueCheck = Long.valueOf(gettingDecimalNo);
            if (valueCheck < 5 || valueCheck < 50 && valueCheck > 10) {
                System.out.println(removeFloatingPoint(input));
            } else {
                System.out.println(removeFloatingPoint(input) + 1);
            }
            System.out.println("DO YOU EXECUTE AGAIN?    Y/N");
            String executedOrNot = i.next();
            if (!executedOrNot.equalsIgnoreCase("y")) {
                System.out.println("Execution is Terminated & Thanks !!");
                break;
            }
        }

    }

    private static long removeFloatingPoint(String input) {
        Double aDouble = Double.valueOf(input);
        long l = aDouble.longValue();
        return l;
    }


}